package com.movie.ticketbooking.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Seat {

	@Id
	@Column
	private int seatId;

	@Column
	private String seatNumber;

	@Column
	private String type;

	@Column
	private double price;

	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "ticketId")
	private Ticket ticket;
	
	public Seat() {
		
	}

	public Seat(int seatId, String seatNumber, String type, double price, Ticket ticket) {
		super();
		this.seatId = seatId;
		this.seatNumber = seatNumber;
		this.type = type;
		this.price = price;
		this.ticket = ticket;
	}

	public int getSeatId() {
		return seatId;
	}

	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}

	public String getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
    
}
