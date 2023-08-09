package com.bookingapp.bookingapp.controllers;

import com.bookingapp.bookingapp.model.Admin;
import com.bookingapp.bookingapp.model.Customer;
import com.bookingapp.bookingapp.model.Employee;
import com.bookingapp.bookingapp.response.BaseResponse;
import com.bookingapp.bookingapp.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("customer")
@CrossOrigin (origins = "http://localhost:4200")
public class CustomerController {
    @Autowired
    private CustomerService service;

    @PostMapping(value = "/getCustomer", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BaseResponse> getCustomer (@RequestBody Customer request){
        return new ResponseEntity<>(this.service.getCustomer(request), HttpStatus.OK);
    }
    @PostMapping(value = "/createCustomer", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BaseResponse> createCustomer (
            @RequestBody Customer request)
    {
        return ResponseEntity.ok(service.createCustomer(request));}
    @PostMapping(value =  "/updateCustomer", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BaseResponse> updateCustomer(
            @RequestBody Customer request) {
        return ResponseEntity.ok(service.updateCustomer(request));}
    @PostMapping(value = "/deleteCustomer", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BaseResponse> deleteCustomer(
            @RequestBody Customer request) {
        return ResponseEntity.ok(service.deleteCustomer(request));
    }
}
