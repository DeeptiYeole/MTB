package com.movie.ticketbooking.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@DiscriminatorValue("C")
public class Customer extends Users {
	
	
	@Column
	private int customerId;
	
	@Column
	private String customerName;
	
	@Column
	private String address;
	
	@Column
	private String mobileNumber;
	
	@Column
	private String email;
	
	@Column
	private String password;
	
	@OneToMany(mappedBy="customer")
	private List<TicketBooking> listOfTicketBooking;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<TicketBooking> getListOfTicketBooking() {
		return listOfTicketBooking;
	}

	public void setListOfTicketBooking(List<TicketBooking> listOfTicketBooking) {
		this.listOfTicketBooking = listOfTicketBooking;
	}
	

}
