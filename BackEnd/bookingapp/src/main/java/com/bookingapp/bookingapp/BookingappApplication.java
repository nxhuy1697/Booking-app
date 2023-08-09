package com.bookingapp.bookingapp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(basePackages = { "com.bookingapp.bookingapp.mapper" })
@SpringBootApplication
public class BookingappApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookingappApplication.class, args);
	}

}
