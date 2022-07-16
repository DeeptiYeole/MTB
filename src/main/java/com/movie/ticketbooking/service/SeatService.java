package com.movie.ticketbooking.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.movie.ticketbooking.exceptions.SeatNotAvailableException;
import com.movie.ticketbooking.model.Seat;

@Service
public interface SeatService {

	List<Seat> getSeat();

	Seat bookSeat(Seat seat);

	Seat blockSeat(Seat seat);

	Seat cancelSeatBooking(Seat seat) throws SeatNotAvailableException;
	
	Seat deleteSeat(int seatId); 

}
