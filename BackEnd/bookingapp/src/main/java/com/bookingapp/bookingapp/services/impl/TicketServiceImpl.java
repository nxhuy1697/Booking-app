package com.bookingapp.bookingapp.services.impl;

import com.bookingapp.bookingapp.mapper.TicketMapper;
import com.bookingapp.bookingapp.model.Ticket;
import com.bookingapp.bookingapp.response.BaseResponse;
import com.bookingapp.bookingapp.services.TicketService;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {
@Autowired
private TicketMapper mapper;
//get
    @Override
    public List<Ticket> getTicket() {
        return this.mapper.getTicket();
    }
//create
    @Override
    public BaseResponse createTicket(Ticket request) {
        Ticket payload = new Ticket();
        int checkCodeExisted = mapper.countTicket(request.getCode());
        if (checkCodeExisted > 0){
            return new BaseResponse(String.valueOf(HttpStatus.BAD_REQUEST.value()),
                    "Đã tồn tại code trong hệ thống");
        }
        int createTicket = mapper.createTicket(request);

        if (createTicket > 0) {
            return new BaseResponse(request, String.valueOf(HttpStatus.OK.value()), "Tạo mới thành công");
        }

        return new BaseResponse(String.valueOf(HttpStatus.BAD_REQUEST.value()), "Tạo mới thất bại");
    }
//update

    @Override
    public BaseResponse updateTicket(Ticket ticketRequest) {

        int updateTicket = mapper.updateTicket(ticketRequest);

        if (updateTicket > 0) {
            return new BaseResponse(ticketRequest, String.valueOf(HttpStatus.OK.value()), "Cập nhật thành công");
        }

        return new BaseResponse(String.valueOf(HttpStatus.BAD_REQUEST.value()), "Cập nhật thất bại");
    }
//delete
    @Override
    public BaseResponse deleteTicket(Ticket ticketRequest) {
        int deleteTicket = mapper.deleteTicket(ticketRequest.getTicketId());
        if (deleteTicket > 0) {
            return new BaseResponse(deleteTicket, String.valueOf(HttpStatus.OK.value()), "Xoá thành công");
        }
        return new BaseResponse(String.valueOf(HttpStatus.BAD_REQUEST.value()), "Xoá thất bại");
    }

}
