package com.bookingapp.bookingapp.controllers;
import com.bookingapp.bookingapp.model.Admin;
import com.bookingapp.bookingapp.model.Employee;
import com.bookingapp.bookingapp.model.Ticket;
import com.bookingapp.bookingapp.response.BaseResponse;
import com.bookingapp.bookingapp.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeController {
    @Autowired
    private EmployeeService service;
    //login
    @PostMapping(value = "/loginEmployee", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BaseResponse> loginEmployee (@RequestBody Employee employee){
        return new ResponseEntity<>(this.service.loginEmployee(employee), HttpStatus.OK);
    }

    @PostMapping(value = "/createEmployee", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BaseResponse> createEmployee (
            @RequestBody Employee request)
    {
        return ResponseEntity.ok(service.createEmployee(request));
    }

    @PostMapping(value =  "/updateEmployee", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BaseResponse> updateEmployee(
            @RequestBody Employee request) {
        return ResponseEntity.ok(service.updateEmployee(request));
    }
    @PostMapping(value = "/deleteEmployee", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BaseResponse> deleteEmployee(
            @RequestBody Employee request) {
        return ResponseEntity.ok(service.deleteEmployee(request));
    }


}
