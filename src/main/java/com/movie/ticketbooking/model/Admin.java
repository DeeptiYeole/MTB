package com.movie.ticketbooking.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@DiscriminatorValue("A")
public class Admin extends Users{
	
	
	@Column
    private int adminId;
	
	@Column
	private String adminName;
	
	@Column
	private String adminContact;
	
	
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminContact() {
		return adminContact;
	}
	public void setAdminContact(String adminContact) {
		this.adminContact = adminContact;
	}

}
