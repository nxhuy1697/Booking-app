package com.bookingapp.bookingapp.mapper;

import com.bookingapp.bookingapp.model.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AccountMapper {
    Account findByUsernameAndPassword (@Param("username") String username, @Param("password") String password);
}
