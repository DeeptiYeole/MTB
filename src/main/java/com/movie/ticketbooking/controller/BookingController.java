package com.movie.ticketbooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.movie.ticketbooking.model.TicketBooking;
import com.movie.ticketbooking.service.BookingService;

@RestController
public class BookingController {
	
	 @Autowired
	 private BookingService bookingService;
	 
	 @GetMapping("/booking")
	 public List<TicketBooking> getTicketBooking(){
	  return bookingService.show();
	 }
	 
	 @PostMapping("/booking")
	 public String addBooking(@RequestBody TicketBooking booking) {
	  bookingService.addBooking(booking);
	  return "Booking done";
	 }
	 
//	 @DeleteMapping("/booking")
//	 public String cancelBooking(@RequestBody TicketBooking booking) {
//	  bookingService.cancelBooking(booking);
//	  return "Booking cancelled";
//	  
//	 }

}
