package com.movie.ticketbooking.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Show {
	@Id
	@Column
	private int showId;
	
	@Column
	private LocalDateTime showStartTime;
	
	@Column
	private LocalDateTime showEndTime;
	
	@Column
	private String showName;

	@OneToOne//(mappedBy = "show")
	private Movie movie;

	@ManyToOne
	private Screen screen;

	@OneToOne
	private Theatre theatre;

	@OneToOne
	@JsonIgnore
	private TicketBooking booking;


	

	public int getShowId() {
		return showId;
	}

	public void setShowId(int showId) {
		this.showId = showId;
	}

	public LocalDateTime getShowStartTime() {
		return showStartTime;
	}

	public void setShowStartTime(LocalDateTime showStartTime) {
		this.showStartTime = showStartTime;
	}

	public LocalDateTime getShowEndTime() {
		return showEndTime;
	}

	public void setShowEndTime(LocalDateTime showEndTime) {
		this.showEndTime = showEndTime;
	}

	

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	

	public String getShowName() {
		return showName;
	}

	public void setShowName(String showName) {
		this.showName = showName;
	}

	public Screen getScreen() {
		return screen;
	}

	public void setScreen(Screen screen) {
		this.screen = screen;
	}

	public Theatre getTheatre() {
		return theatre;
	}

	public void setTheatre(Theatre theatre) {
		this.theatre = theatre;
	}

	public TicketBooking getBooking() {
		return booking;
	}

	public void setBooking(TicketBooking booking) {
		this.booking = booking;
	}

	public Show() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Show(int showId, LocalDateTime showStartTime, LocalDateTime showEndTime, String showName, Movie movie,
			Screen screen, Theatre theatre, TicketBooking booking) {
		super();
		this.showId = showId;
		this.showStartTime = showStartTime;
		this.showEndTime = showEndTime;
		this.showName = showName;
		this.movie = movie;
		this.screen = screen;
		this.theatre = theatre;
		this.booking = booking;
	}
	
	
}
