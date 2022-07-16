package com.movie.ticketbooking.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.ticketbooking.model.Show;
import com.movie.ticketbooking.repo.ScreenRepo;
import com.movie.ticketbooking.repo.ShowRepo;
import com.movie.ticketbooking.repo.TheatreRepo;
import com.movie.ticketbooking.service.ShowService;

@Service
public class ShowServiceImpl implements ShowService{

	@Autowired
	ShowRepo showrepo;
	@Autowired
	private TheatreRepo theatrerepo;
	@Autowired
	private ScreenRepo screenrepo;
	
	@Override
	public Show addShow(Show show) {
		showrepo.save(show);
		return show;
	}

	@Override
	public Show updateShow(Show show) {
		showrepo.save(show);
		return show;
	}

	@Override
	public Show removeShow(int showId) {
		Show s = showrepo.findById(showId).get();
		showrepo.delete(s);
		return s;
	}

	@Override
	public Show viewShow(int showId) {
		return showrepo.findById(showId).get();
	}

	@Override
	public List<Show> viewAllShows() {
		return showrepo.findAll();
	}

//	@Override
//	public List<Show> viewShowList(int theatreid) {
//		return showrepo.getAllByTheatreId(theatreid);
//	}

}
