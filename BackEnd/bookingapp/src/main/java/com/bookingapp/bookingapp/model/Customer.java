package com.bookingapp.bookingapp.model;



import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigInteger;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Customer {
    private BigInteger customerId;
    private String customerName;
    private int priorityStatus;
    private String email;
    private String phone;
    private String product;



    public Customer() {
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public BigInteger getCustomerId() {
        return customerId;
    }

    public void setCustomerId(BigInteger customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getPriorityStatus() {
        return priorityStatus;
    }

    public void setPriorityStatus(int priorityStatus) {
        this.priorityStatus = priorityStatus;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
