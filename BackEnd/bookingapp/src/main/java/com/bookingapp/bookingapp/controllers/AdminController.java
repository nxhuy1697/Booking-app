package com.bookingapp.bookingapp.controllers;

import com.bookingapp.bookingapp.model.Admin;
import com.bookingapp.bookingapp.model.Ticket;
import com.bookingapp.bookingapp.response.BaseResponse;
import com.bookingapp.bookingapp.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
@CrossOrigin(origins = "http://localhost:4200")
public class AdminController {
    @Autowired
    private AdminService service;
    @PostMapping(value = "/loginAdmin", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BaseResponse> loginAdmin (@RequestBody Admin admin){
        return new ResponseEntity<>(this.service.loginAdmin(admin), HttpStatus.OK);
    }
    @PostMapping(value = "/createAdmin", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BaseResponse> createAdmin (
            @RequestBody Admin request)
    {
        return ResponseEntity.ok(service.createAdmin(request));
    }
    @PostMapping(value =  "/updateAdmin", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BaseResponse> updateAdmin(
            @RequestBody Admin adminRequest) {
        return ResponseEntity.ok(service.updateAdmin(adminRequest));
    }
    @PostMapping(value = "/deleteAdmin", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BaseResponse> deleteAdmin(
            @RequestBody Admin adminRequest) {
        return ResponseEntity.ok(service.deleteAdmin(adminRequest));
    }

}
