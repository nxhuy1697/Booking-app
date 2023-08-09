package com.bookingapp.bookingapp.services;

import com.bookingapp.bookingapp.model.Ticket;
import com.bookingapp.bookingapp.response.BaseResponse;

import java.util.List;

public interface TicketService {
    List<Ticket> getTicket();
    BaseResponse createTicket (Ticket request);
    BaseResponse updateTicket (Ticket ticketRequest);
    BaseResponse deleteTicket (Ticket ticketRequest);
}
