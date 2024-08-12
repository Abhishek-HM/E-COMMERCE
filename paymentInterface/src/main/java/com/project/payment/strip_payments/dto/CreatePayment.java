package com.project.payment.strip_payments.dto;

import com.google.gson.annotations.SerializedName;

public class CreatePayment {
        @SerializedName("items")
        CreatePaymentItem[] items;

        public CreatePaymentItem[] getItems() {
            return items;
        }

    }

