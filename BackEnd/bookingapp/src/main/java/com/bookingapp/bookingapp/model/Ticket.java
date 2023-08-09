package com.bookingapp.bookingapp.model;

import java.math.BigInteger;

public class Ticket {
    private BigInteger ticketId;
    private BigInteger customerId;
    private BigInteger employeeId;
    private String issueDescription;
    private int ticketStatus;
    private String code;


    public Ticket() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BigInteger getTicketId() {
        return ticketId;
    }

    public void setTicketId(BigInteger ticketId) {
        this.ticketId = ticketId;
    }

    public BigInteger getCustomerId() {
        return customerId;
    }

    public void setCustomerId(BigInteger customerId) {
        this.customerId = customerId;
    }

    public BigInteger getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(BigInteger employeeId) {
        this.employeeId = employeeId;
    }

    public String getIssueDescription() {
        return issueDescription;
    }

    public void setIssueDescription(String issueDescription) {
        this.issueDescription = issueDescription;
    }

    public int getTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(int ticketStatus) {
        this.ticketStatus = ticketStatus;
    }
}
