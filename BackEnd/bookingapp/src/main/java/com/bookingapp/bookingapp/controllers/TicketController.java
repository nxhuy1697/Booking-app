package com.bookingapp.bookingapp.controllers;

import com.bookingapp.bookingapp.model.Ticket;
import com.bookingapp.bookingapp.response.BaseResponse;
import com.bookingapp.bookingapp.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/ticket")
@CrossOrigin(origins = "http://localhost:4200")
public class TicketController {
    @Autowired
    private TicketService service;
    @GetMapping(value = "", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BaseResponse> ticket(Ticket ticket){
        BaseResponse baseResponse = new BaseResponse();
        List<Ticket> list = service.getTicket();
        baseResponse.setErrorCode(String.valueOf(HttpStatus.OK.value()));
        baseResponse.setErrorDesc("Success");
        baseResponse.setData(list);
        return new ResponseEntity<>(baseResponse, HttpStatus.OK);
    }
    @PostMapping(value = "/createTicket", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BaseResponse> createTicket (
            @RequestBody Ticket request)
    {
        return ResponseEntity.ok(service.createTicket(request));
    }
    @PostMapping(value =  "/updateTicket", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BaseResponse> updateTicket(
            @RequestBody Ticket ticketRequest) {
        return ResponseEntity.ok(service.updateTicket(ticketRequest));
    }
    @PostMapping(value = "/deleteTicket", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BaseResponse> deleteTicket(
            @RequestBody Ticket ticketRequest) {
        return ResponseEntity.ok(service.deleteTicket(ticketRequest));
    }
}
