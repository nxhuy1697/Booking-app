package com.bookingapp.bookingapp.services;

import com.bookingapp.bookingapp.model.Employee;
import com.bookingapp.bookingapp.model.Ticket;
import com.bookingapp.bookingapp.response.BaseResponse;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmployeeService {
    BaseResponse loginEmployee (Employee employee);
    BaseResponse createEmployee (Employee request);
    BaseResponse updateEmployee (Employee request);
    BaseResponse deleteEmployee (Employee request);
}
