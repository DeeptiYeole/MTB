package com.movie.ticketbooking.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Ticket {
	
	@Id
	@Column
	private int ticketId;
	
	@Column
	private int noOfSeats;
	
	
	
	@OneToMany(mappedBy="ticket",fetch=FetchType.LAZY)
	private List<Seat> seatNumber;
	
	@OneToOne
	@JsonIgnore
	private TicketBooking bookingRef;
	
	@Column
	private boolean ticketStatus;
	
	public Ticket() {
		
	}

	public Ticket(int ticketId, int noOfSeats, List<Seat> seatNumber, boolean ticketStatus) {
	super();
	this.ticketId = ticketId;
	this.noOfSeats = noOfSeats;
	this.seatNumber = seatNumber;
	this.ticketStatus = ticketStatus;
}

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public List<Seat> getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(List<Seat> seatNumber) {
		this.seatNumber = seatNumber;
	}

	public TicketBooking getBookingRef() {
		return bookingRef;
	}

	public void setBookingRef(TicketBooking bookingRef) {
		this.bookingRef = bookingRef;
	}

	public boolean isTicketStatus() {
		return ticketStatus;
	}

	public void setTicketStatus(boolean ticketStatus) {
		this.ticketStatus = ticketStatus;
	}
	
	

}
