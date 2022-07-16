package com.movie.ticketbooking.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Movie {
	
	@Id
	@Column
	private int movieId;
	@Column
	private String movieName;
	@Column
	private String movieGenre;
	@Column
	private String movieHours;
	@Column
	private String language;
	@Column
	private String description;
	
	@ManyToOne
	//@JoinColumn//(name="theaId")
    @JsonIgnore
	private Theatre theatre;
//	
	@OneToOne
	//@JoinColumn(name="showId")
	@JsonIgnore
	private Show show;
	
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieGenre() {
		return movieGenre;
	}
	public void setMovieGenre(String movieGenre) {
		this.movieGenre = movieGenre;
	}
	public String getMovieHours() {
		return movieHours;
	}
	public void setMovieHours(String movieHours) {
		this.movieHours = movieHours;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Theatre getTheatre() {
		return theatre;
	}
	public void setTheatre(Theatre theatre) {
		this.theatre = theatre;
	}
	public Show getShow() {
		return show;
	}
	public void setShow(Show show) {
		this.show = show;
	}
    
	

}
