package com.bookingapp.bookingapp.model;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.math.BigInteger;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Admin {
    private BigInteger adminId;
    private String username;
    private String password;
    private String roleCode;
    private String code;

    public Admin() {
    }

    public Admin(BigInteger adminId, String username, String password, String roleCode, String code) {
        this.adminId = adminId;
        this.username = username;
        this.password = password;
        this.roleCode = roleCode;
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public BigInteger getAdminId() {
        return adminId;
    }

    public void setAdminId(BigInteger adminId) {
        this.adminId = adminId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
