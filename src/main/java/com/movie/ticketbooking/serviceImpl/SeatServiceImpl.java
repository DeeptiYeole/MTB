package com.movie.ticketbooking.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.ticketbooking.exceptions.SeatNotAvailableException;
import com.movie.ticketbooking.model.Seat;
import com.movie.ticketbooking.repo.SeatRepo;
import com.movie.ticketbooking.service.SeatService;

@Service
public class SeatServiceImpl implements SeatService {
	@Autowired
	SeatRepo seatRepo;

	public List<Seat> getSeat() {
		return seatRepo.findAll();
	}

	public Seat bookSeat(Seat seat) {
		seatRepo.save(seat);
		return seat;
	}

	public Seat blockSeat(Seat seat) {
		seatRepo.save(seat);
		return seat;
	}

	public Seat cancelSeatBooking(Seat seat) throws SeatNotAvailableException {
		seatRepo.delete(seat);
		return seat;

	}
	
	public Seat deleteSeat(int seatId) {
		Seat s=seatRepo.findById(seatId).get();
		seatRepo.delete(s);
		return s;
	}

}













//try {
//seatRepo.delete(seat);
//}catch(Exception e) {
//	throw new SeatNotAvailableException("Seat not found");
//}
//
//return seat;