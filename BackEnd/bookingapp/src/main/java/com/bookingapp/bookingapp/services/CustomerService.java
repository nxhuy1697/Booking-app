package com.bookingapp.bookingapp.services;

import com.bookingapp.bookingapp.model.Customer;
import com.bookingapp.bookingapp.response.BaseResponse;

public interface CustomerService {
    BaseResponse getCustomer (Customer request);
    BaseResponse createCustomer (Customer request);
    BaseResponse updateCustomer (Customer request);
    BaseResponse deleteCustomer (Customer request);
}
