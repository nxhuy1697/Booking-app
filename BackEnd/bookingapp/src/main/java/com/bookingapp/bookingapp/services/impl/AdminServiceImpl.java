package com.bookingapp.bookingapp.services.impl;

import com.bookingapp.bookingapp.mapper.AdminMapper;
import com.bookingapp.bookingapp.model.Admin;
import com.bookingapp.bookingapp.model.Ticket;
import com.bookingapp.bookingapp.response.BaseResponse;
import com.bookingapp.bookingapp.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper mapper;
//    login
    @Override
    public BaseResponse loginAdmin(Admin admin) {
        Admin admin1 = mapper.findByEmailAndPassword(admin.getUsername());
        if (admin.getPassword().equals(admin1.getPassword())){
            return new BaseResponse(admin,String.valueOf(HttpStatus.OK.value()),"Success!!") ;
        }
        else {
            return new BaseResponse
                    (admin,String.valueOf(HttpStatus.NOT_FOUND.value()), "Wrong Password or User name");
        }


    }

    @Override
    public BaseResponse createAdmin(Admin request) {
        Admin payload = new Admin();
        int checkCodeExisted = mapper.countAdmin(request.getCode());
        if (checkCodeExisted > 0){
            return new BaseResponse(String.valueOf(HttpStatus.BAD_REQUEST.value()),
                    "Đã tồn tại code trong hệ thống");
        }
        int createAdmin = mapper.createAdmin(request);

        if (createAdmin > 0) {
            return new BaseResponse(request, String.valueOf(HttpStatus.OK.value()), "Tạo mới thành công");
        }

        return new BaseResponse(String.valueOf(HttpStatus.BAD_REQUEST.value()), "Tạo mới thất bại");
    }

    @Override
    public BaseResponse updateAdmin(Admin adminRequest) {
        int updateAdmin = mapper.updateAdmin(adminRequest);

        if (updateAdmin > 0) {
            return new BaseResponse(adminRequest, String.valueOf(HttpStatus.OK.value()), "Cập nhật thành công");
        }

        return new BaseResponse(String.valueOf(HttpStatus.BAD_REQUEST.value()), "Cập nhật thất bại");
    }

    @Override
    public BaseResponse deleteAdmin(Admin adminRequest) {
        int deleteAdmin = mapper.deleteAdmin(adminRequest.getAdminId());
        if (deleteAdmin > 0) {
            return new BaseResponse(deleteAdmin, String.valueOf(HttpStatus.OK.value()), "Xoá thành công");
        }
        return new BaseResponse(String.valueOf(HttpStatus.BAD_REQUEST.value()), "Xoá thất bại");
    }


}
