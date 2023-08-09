package com.bookingapp.bookingapp.mapper;
import com.bookingapp.bookingapp.model.Admin;
import com.bookingapp.bookingapp.model.Ticket;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigInteger;


@Mapper
public interface AdminMapper {
   Admin findByEmailAndPassword (@Param("username") String username);

   int createAdmin (Admin request);
   int countAdmin (String code);
   int updateAdmin(Admin adminRequest);
   int deleteAdmin(BigInteger adminId);

}
