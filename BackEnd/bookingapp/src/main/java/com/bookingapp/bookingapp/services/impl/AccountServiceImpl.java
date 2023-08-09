package com.bookingapp.bookingapp.services.impl;

import com.bookingapp.bookingapp.mapper.AccountMapper;
import com.bookingapp.bookingapp.model.Account;
import com.bookingapp.bookingapp.response.BaseResponse;
import com.bookingapp.bookingapp.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper mapper;


    @Override
    public BaseResponse loginAccount(Account request) {
        Account account = mapper.findByUsernameAndPassword(request.getUsername(), request.getPassword());
        if (request.getPassword().equals(account.getPassword())){
            return new BaseResponse(account,String.valueOf(HttpStatus.OK.value()),"Success!!") ;
        }
        else {
            return new BaseResponse
                    (account,String.valueOf(HttpStatus.NOT_FOUND.value()), "Wrong Password or User name");
        }
    }
}
