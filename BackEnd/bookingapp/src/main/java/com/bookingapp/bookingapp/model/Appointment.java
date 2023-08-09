package com.bookingapp.bookingapp.model;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.math.BigInteger;
import java.util.Date;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Appointment {
    private BigInteger appointmentId;
    private BigInteger customerId;
    private BigInteger employeeId;
    private BigInteger productId;
    private Date appointmentTime;

    public Appointment() {
    }

    public BigInteger getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(BigInteger appointmentId) {
        this.appointmentId = appointmentId;
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

    public BigInteger getProductId() {
        return productId;
    }

    public void setProductId(BigInteger productId) {
        this.productId = productId;
    }

    public Date getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(Date appointmentTime) {
        this.appointmentTime = appointmentTime;
    }
}
