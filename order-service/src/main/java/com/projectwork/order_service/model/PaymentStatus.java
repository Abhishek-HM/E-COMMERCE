package com.projectwork.order_service.model;

import lombok.Getter;

public enum PaymentStatus {
    PENDING_PAYMENT("PENDING_PAYMENT"),
    PAYMENT_COMPLETED("PAYMENT_COMPLETED");

    private String message;

    PaymentStatus(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
