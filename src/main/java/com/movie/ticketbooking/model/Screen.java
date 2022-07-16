package com.movie.ticketbooking.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Screen {
	
	@Id
	@Column
	private int screenId;
	
	@ManyToOne
	@JsonIgnore
	private Theatre theatre;
	
	@OneToMany(mappedBy = "screen")
	@JsonIgnore
	private List<Show> show;
	
	@Column
	private String screenName;

	@Column
	private int rows;
	@Column
	private int columns;
	
	
	
	public Screen() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Screen(int screenId, Theatre theatre, List<Show> show, String screenName, int rows, int columns) {
		super();
		this.screenId = screenId;
		this.theatre = theatre;
		this.show = show;
		this.screenName = screenName;
		this.rows = rows;
		this.columns = columns;
	}
	public int getScreenId() {
		return screenId;
	}
	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}

	
	public String getScreenName() {
		return screenName;
	}
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getColumns() {
		return columns;
	}
	public void setColumns(int columns) {
		this.columns = columns;
	}
	public Theatre getTheatre() {
		return theatre;
	}
	public void setTheatre(Theatre theatre) {
		this.theatre = theatre;
	}
	public List<Show> getShow() {
		return show;
	}
	public void setShow(List<Show> show) {
		this.show = show;
	}
	

}
