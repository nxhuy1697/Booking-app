package com.bookingapp.bookingapp.services;


import com.bookingapp.bookingapp.model.Admin;
import com.bookingapp.bookingapp.model.Ticket;
import com.bookingapp.bookingapp.response.BaseResponse;

public interface AdminService {
    BaseResponse loginAdmin (Admin admin);
    BaseResponse createAdmin (Admin request);
    BaseResponse updateAdmin (Admin adminRequest);
    BaseResponse deleteAdmin (Admin adminRequest);
}

