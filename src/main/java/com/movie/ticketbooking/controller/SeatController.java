package com.movie.ticketbooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.ticketbooking.model.Seat;
import com.movie.ticketbooking.service.SeatService;

@RestController
public class SeatController {


    @Autowired
    private SeatService seatService;


    
    @CrossOrigin(origins="http://localhost:3000")
	@GetMapping("/seats")
	public List<Seat> getSeats() {
		return seatService.getSeat();
	}

	@PostMapping("/seats")
	public String addSeat(Seat seat) {
		seatService.bookSeat(seat);
		return "Seat Booked";

	}

	
	@DeleteMapping("/seats")
	public String delete(int seatId) {
		seatService.deleteSeat(seatId);
		return "deleted successfully";
	}
	


}










//
//@PostMapping("/seats")
//public String upSeat(Seat seat) {
//	seatService.blockSeat(seat);
//	return "Seat Updated";
//
//}


//@DeleteMapping("/seats")
//public String delete(@RequestBody Seat seat) throws SeatNotAvailableException {
//   seatService.cancelSeatBooking(seat);
//   return "Seat Cancelled";
//}
