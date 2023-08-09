package com.bookingapp.bookingapp.controllers;

import com.bookingapp.bookingapp.model.Account;
import com.bookingapp.bookingapp.model.Admin;
import com.bookingapp.bookingapp.response.BaseResponse;
import com.bookingapp.bookingapp.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
@CrossOrigin(origins = "http://localhost:4200")
public class AccountController {
    @Autowired
    private AccountService service;

    @PostMapping(value = "/login", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BaseResponse> loginAdmin (@RequestBody Account request){
        return new ResponseEntity<>(this.service.loginAccount(request), HttpStatus.OK);
    }

}
