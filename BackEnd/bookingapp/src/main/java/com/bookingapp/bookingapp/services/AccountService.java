package com.bookingapp.bookingapp.services;

import com.bookingapp.bookingapp.model.Account;
import com.bookingapp.bookingapp.response.BaseResponse;

public interface AccountService {
    BaseResponse loginAccount (Account request);
}
