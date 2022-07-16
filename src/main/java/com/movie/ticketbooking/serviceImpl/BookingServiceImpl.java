package com.movie.ticketbooking.serviceImpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.ticketbooking.exceptions.BookingNotFoundException;
import com.movie.ticketbooking.model.Seat;
import com.movie.ticketbooking.model.Ticket;
import com.movie.ticketbooking.model.TicketBooking;
import com.movie.ticketbooking.repo.BookingRepo;
import com.movie.ticketbooking.repo.CustomerRepo;
import com.movie.ticketbooking.repo.MovieRepo;
import com.movie.ticketbooking.repo.ShowRepo;
import com.movie.ticketbooking.repo.TicketRepo;
import com.movie.ticketbooking.service.BookingService;


@Service
public class BookingServiceImpl implements BookingService{
	
	@Autowired
	BookingRepo bookingrepo;
	
	@Autowired
	MovieRepo movierepo;
	
	@Autowired
	ShowRepo showrepo;
	
	@Autowired
	CustomerRepo customerrepo;
	
	@Autowired
	TicketRepo ticketrepo;
	
	
	@Override
	public TicketBooking addBooking(TicketBooking booking) {
		bookingrepo.save(booking);
		return booking;
	}
	@Override
	public TicketBooking updateBooking(TicketBooking booking) throws BookingNotFoundException  {
		bookingrepo.saveAndFlush(booking);
		return bookingrepo.getOne(booking.getTransactionId());
	}
	@Override
	public TicketBooking cancelBooking(int bookingid) throws BookingNotFoundException  {
		TicketBooking b = bookingrepo.getOne(bookingid);
		bookingrepo.delete(b);
		return b;
	}
	@Override
	public double TotalCost(int bookingid) {
		List<Ticket> tickets = ticketrepo.findAll();
		Set<Seat> Seats = new HashSet<>();
		for (Ticket ticket : tickets) {
			if (bookingid == ticket.getBookingRef().getTransactionId()) {
				Seats.addAll(ticket.getSeatNumber());
			}
		}
		double amount = 0;
		for (Seat seat : Seats) {
			amount = amount + seat.getPrice();
		}
		TicketBooking booking = bookingrepo.getOne(bookingid);
		booking.setTotalCost(amount);
		bookingrepo.saveAndFlush(booking);
		return amount;
	}
	@Override
	public List<TicketBooking> showAllBooking(LocalDate date) throws BookingNotFoundException {
		List<TicketBooking> bkList = new ArrayList<>();
		for (TicketBooking booking : bookingrepo.findAll()) {
			if (booking.getBookingDate() != null) {
				bkList.add(booking);
			}
		}
		if (bkList.size() == 0)
			throw new BookingNotFoundException("No bookings found");
		else {
			return bkList;
		}
	}
	
	public List<TicketBooking> show(){
		return bookingrepo.findAll();
		
	}


}
