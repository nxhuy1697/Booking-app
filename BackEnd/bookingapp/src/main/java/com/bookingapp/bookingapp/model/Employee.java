package com.bookingapp.bookingapp.model;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.math.BigInteger;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Employee {

    private BigInteger employeeId;
    private String employeeName;
    private String email;
    private String password;
    private String phone;
    private String supportedProduct;
    private int isAvailable;
    private String code;


    public Employee() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BigInteger getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(BigInteger employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSupportedProduct() {
        return supportedProduct;
    }

    public void setSupportedProduct(String supportedProduct) {
        this.supportedProduct = supportedProduct;
    }

    public int getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(int isAvailable) {
        this.isAvailable = isAvailable;
    }
}
