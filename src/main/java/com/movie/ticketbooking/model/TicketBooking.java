package com.movie.ticketbooking.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class TicketBooking {
	
	@Id
	@Column
	private int transactionId;
	
	@OneToOne//(mappedBy = "ticketBooking")
	private Show show;
	
	
	@Column
	private LocalDate bookingDate;
	
	

	
	@Column
	private String transactionMode;
	
	@Column
	private String transactionStatus;
	
	@Column
	private double totalCost;
	
	@OneToOne//(mappedBy="ticketBooking")
	private Ticket ticket;

	@ManyToOne
	@JsonIgnore
	private Customer customer;
	
	


	public TicketBooking() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public TicketBooking(int transactionId, Show show, LocalDate bookingDate, String transactionMode,
			String transactionStatus, double totalCost, Ticket ticket, Customer customer) {
		super();
		this.transactionId = transactionId;
		this.show = show;
		this.bookingDate = bookingDate;
		this.transactionMode = transactionMode;
		this.transactionStatus = transactionStatus;
		this.totalCost = totalCost;
		this.ticket = ticket;
		this.customer = customer;
	}




	public LocalDate getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public String getTransactionMode() {
		return transactionMode;
	}

	public void setTransactionMode(String transactionMode) {
		this.transactionMode = transactionMode;
	}

	public String getTransactionStatus() {
		return transactionStatus;
	}

	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	public Show getShow() {
		return show;
	}

	public void setShow(Show show) {
		this.show = show;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	

}
