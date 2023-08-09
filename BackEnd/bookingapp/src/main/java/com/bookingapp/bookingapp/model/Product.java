package com.bookingapp.bookingapp.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.math.BigInteger;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Product {

    private BigInteger productId;
    private String productName;

    public Product() {
    }

    public BigInteger getProductId() {
        return productId;
    }

    public void setProductId(BigInteger productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
