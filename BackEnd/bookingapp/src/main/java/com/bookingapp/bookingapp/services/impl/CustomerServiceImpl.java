package com.bookingapp.bookingapp.services.impl;

import com.bookingapp.bookingapp.mapper.CustomerMapper;
import com.bookingapp.bookingapp.model.Admin;
import com.bookingapp.bookingapp.model.Customer;
import com.bookingapp.bookingapp.response.BaseResponse;
import com.bookingapp.bookingapp.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerMapper mapper;
    @Override
    public BaseResponse getCustomer(Customer request) {
        BaseResponse payload = new BaseResponse();
        try{
            List<Customer> result = new ArrayList<>();
            int count = mapper.countCustomer(request);

            if(count > 0) {
                result = mapper.filter(request);
            }
            return new BaseResponse(result,"1","success");

        }catch (Exception e){
            payload = new BaseResponse("3", "Failed");

        }
        return payload;
    }

    @Override
    public BaseResponse createCustomer(Customer request) {
        BaseResponse baseResponse = new BaseResponse();
        try{
            Customer result = mapper.createCustomer(request);

            if(result != null ) {
                return new BaseResponse(result, "0", "Create Successfully");
            }else {
                return new BaseResponse("1", "Create failure");
            }
        }catch (Exception e){
            baseResponse = new BaseResponse("1", "Failed");
            return baseResponse;
        }

    }

    @Override
    public BaseResponse updateCustomer(Customer request) {
        int updateCustomer = mapper.updateCustomer(request);

        if (updateCustomer > 0) {
            return new BaseResponse(request, String.valueOf(HttpStatus.OK.value()), "Cập nhật thành công");
        }

        return new BaseResponse(String.valueOf(HttpStatus.BAD_REQUEST.value()), "Cập nhật thất bại");
    }

    @Override
    public BaseResponse deleteCustomer(Customer request) {
        int deleteCustomer = mapper.deleteCustomer(request.getCustomerId());
        if (deleteCustomer > 0) {
            return new BaseResponse(request, String.valueOf(HttpStatus.OK.value()), "Xoá thành công");
        }
        return new BaseResponse(String.valueOf(HttpStatus.BAD_REQUEST.value()), "Xoá thất bại");
    }

}
