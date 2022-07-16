package com.movie.ticketbooking.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.movie.ticketbooking.model.Show;

@Service
public interface ShowService {

	Show addShow(Show show);

	Show updateShow(Show show);

	Show removeShow(int showId);

	Show viewShow(int showId);
	
	public List<Show> viewAllShows();

//	public List<Show> viewShowList(int theatreid);


}
