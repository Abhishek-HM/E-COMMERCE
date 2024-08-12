package com.projectwork.product_service.controller;

import com.projectwork.product_service.dto.ProductRequest;
import com.projectwork.product_service.dto.ProductResponse;
import com.projectwork.product_service.model.Product;
import com.projectwork.product_service.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String createProduct(@RequestBody ProductRequest productRequest) {
        productService.createProduct(productRequest);
        return "Product Successfully Created";
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<ProductResponse>> getAllProducts() {
        List<ProductResponse> responses = new ArrayList<>();
        try {
            responses = productService.getAllProducts();
        }
        catch (RuntimeException runtimeException)
        {
            ResponseEntity.status(HttpStatus.NO_CONTENT).body("No Products Found.");
        }
        return ResponseEntity.status(HttpStatus.OK).body(responses);
    }
}
