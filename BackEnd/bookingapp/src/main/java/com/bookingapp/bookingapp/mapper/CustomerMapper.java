package com.bookingapp.bookingapp.mapper;

import com.bookingapp.bookingapp.model.Customer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigInteger;
import java.util.List;

@Mapper
public interface CustomerMapper {
    List<Customer> filter (Customer request);
    int countCustomer (Customer request);
    Customer createCustomer (Customer request);
    int updateCustomer (Customer request);
    int deleteCustomer (BigInteger customerId);



}
