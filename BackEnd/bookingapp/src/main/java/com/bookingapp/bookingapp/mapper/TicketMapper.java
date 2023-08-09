package com.bookingapp.bookingapp.mapper;

import com.bookingapp.bookingapp.model.Ticket;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigInteger;
import java.util.List;

@Mapper
public interface TicketMapper {
    List<Ticket> getTicket ();
    int createTicket (Ticket request);
    int countTicket (String code);
    int updateTicket(Ticket ticketRequest);
    int deleteTicket(BigInteger ticketId);

}
