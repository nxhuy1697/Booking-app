package com.bookingapp.bookingapp.services.impl;

import com.bookingapp.bookingapp.mapper.EmployeeMapper;
import com.bookingapp.bookingapp.model.Admin;
import com.bookingapp.bookingapp.model.Employee;
import com.bookingapp.bookingapp.model.Ticket;
import com.bookingapp.bookingapp.response.BaseResponse;
import com.bookingapp.bookingapp.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeMapper mapper;
//login
    @Override
    public BaseResponse loginEmployee(Employee employee) {
        Employee employee1 = mapper.findByEmailAndPassword(employee.getEmail());
        if (employee.getPassword().equals(employee1.getPassword())){
            return new BaseResponse(employee,String.valueOf(HttpStatus.OK.value()),"Ur in!!") ;
        }
        else {
            return new BaseResponse
                    (employee,String.valueOf(HttpStatus.NOT_FOUND.value()), "Wrong Password or User name");
        }
    }
//create
    @Override
    public BaseResponse createEmployee(Employee request) {
        Employee payload = new Employee();
        int checkCodeExisted = mapper.countEmployee(request.getCode());
        if (checkCodeExisted > 0){
            return new BaseResponse(String.valueOf(HttpStatus.BAD_REQUEST.value()),
                    "Đã tồn tại code trong hệ thống");
        }
        int createEmployee = mapper.createEmployee(request);

        if (createEmployee > 0) {
            return new BaseResponse(request, String.valueOf(HttpStatus.OK.value()), "Tạo mới thành công");
        }

        return new BaseResponse(String.valueOf(HttpStatus.BAD_REQUEST.value()), "Tạo mới thất bại");
    }

    @Override
    public BaseResponse updateEmployee(Employee request) {
        int updateEmployee = mapper.updateEmployee(request);

        if (updateEmployee > 0) {
            return new BaseResponse(request, String.valueOf(HttpStatus.OK.value()), "Cập nhật thành công");
        }

        return new BaseResponse(String.valueOf(HttpStatus.BAD_REQUEST.value()), "Cập nhật thất bại");
    }

    @Override
    public BaseResponse deleteEmployee(Employee request) {
        int deleteEmployee = mapper.deleteEmployee(request.getEmployeeId());
        if (deleteEmployee > 0) {
            return new BaseResponse(request, String.valueOf(HttpStatus.OK.value()), "Xoá thành công");
        }
        return new BaseResponse(String.valueOf(HttpStatus.BAD_REQUEST.value()), "Xoá thất bại");
    }

}
