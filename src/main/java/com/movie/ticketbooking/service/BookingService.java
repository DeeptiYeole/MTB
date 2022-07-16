package com.movie.ticketbooking.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.movie.ticketbooking.exceptions.BookingNotFoundException;
import com.movie.ticketbooking.model.TicketBooking;

@Service
public interface BookingService {

	TicketBooking addBooking(TicketBooking booking);

	TicketBooking updateBooking(TicketBooking booking) throws BookingNotFoundException;;

	TicketBooking cancelBooking(int bookingId) throws BookingNotFoundException;
		
	List<TicketBooking> showAllBooking(LocalDate date) throws BookingNotFoundException;
	
	double TotalCost(int bookingid);
	
	public List<TicketBooking> show();


}
