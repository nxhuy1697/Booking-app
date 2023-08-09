package com.bookingapp.bookingapp.mapper;

import com.bookingapp.bookingapp.model.Employee;
import com.bookingapp.bookingapp.model.Ticket;
import org.apache.ibatis.annotations.Mapper;

import java.math.BigInteger;
import java.util.List;

@Mapper
public interface EmployeeMapper {
    Employee findByEmailAndPassword (String email);
    int createEmployee (Employee request);
    int countEmployee (String request);
    int updateEmployee (Employee request);
    int deleteEmployee (BigInteger employeeId);
}
