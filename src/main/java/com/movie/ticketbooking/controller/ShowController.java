package com.movie.ticketbooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.ticketbooking.model.Show;
import com.movie.ticketbooking.service.ShowService;

@RestController
public class ShowController {
	 @Autowired
	    private ShowService showService;
	 
	 @GetMapping("/show")
		public List<Show> getShows() {
			return showService.viewAllShows();
		}
	 
	 @PostMapping("/show")
	 public Show addShows(Show show) {
		 showService.addShow(show);
		 return show;
	 }
	 
	 @DeleteMapping("/show")
	 public Show deleteShows(int showId) {
		 Show s=showService.removeShow(showId);
		 //showService.removeShow(showId);
		 return s;
	 }
	 
	 

}