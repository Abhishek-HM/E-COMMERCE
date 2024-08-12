package com.project.payment.strip_payments.dto;

import com.google.gson.annotations.SerializedName;

public class CreatePaymentItem {
    @SerializedName("id")
    String id;

    public String getId() {
        return id;
    }
}
