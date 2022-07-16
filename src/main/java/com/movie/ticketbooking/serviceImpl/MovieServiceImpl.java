package com.movie.ticketbooking.serviceImpl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.ticketbooking.exceptions.MovieNotFoundException;
import com.movie.ticketbooking.model.Movie;
import com.movie.ticketbooking.model.Show;
import com.movie.ticketbooking.repo.MovieRepo;
import com.movie.ticketbooking.repo.ShowRepo;
import com.movie.ticketbooking.repo.TheatreRepo;
import com.movie.ticketbooking.service.MovieService;

@Service
public class MovieServiceImpl implements MovieService {
	@Autowired
	MovieRepo movierepo;
	@Autowired
	TheatreRepo theatrerepo;
	@Autowired
	ShowRepo showrepo;

	public Movie addMovie(Movie movie) throws MovieNotFoundException{
		if (movie != null) {
			if (movierepo.existsById(movie.getMovieId())) {
				throw new MovieNotFoundException("Movie with this id already exists");
			} else {
				movierepo.saveAndFlush(movie);
			}
		}
		return movie;
	}

	public Movie updateMovie(Movie movie) {
		movierepo.saveAndFlush(movie);
		return movierepo.getOne(movie.getMovieId());
	}

	public Movie removeMovie(int movieId) throws MovieNotFoundException {
		Movie m = movierepo.findById(movieId).get();
		List<Show> shows = showrepo.findAll();
		for (Show show : shows) {
			if (show.getMovie()!=null && show.getMovie().getMovieId() == movieId) {
				show.setMovie(null);
			}
		}
		movierepo.delete(m);
		return m;
	}

	@Override
	public Movie viewMovie(int movieId) throws MovieNotFoundException {
		return movierepo.findById(movieId).get();
	}

	public List<Movie> viewMovieList() throws MovieNotFoundException {
		List<Movie> ml = movierepo.findAll();
		return ml;
	}

	@Override
	public List<Movie> viewMovieList(int theatreid) {
		List<Movie> movies = new ArrayList<>();
		List<Show> shows = showrepo.findAll();
		Set<Integer> showIds = new HashSet<>();
		for (Show s : shows) {
			if (s.getTheatre().getTheatreId() == theatreid) {
				showIds.add(s.getShowId());
			}
		}
		for (Integer id : showIds) {
			movies.add(showrepo.getOne(id).getMovie());
		}
		return movies;
	}

//	@Override
//	public List<Movie> viewMovieList(LocalDate date) {
//		List<Movie> mvList = new ArrayList<>();
//		for (Movie movie : movierepo.findAll()) {
//			if (movie.getMovieDate() != null && movie.getMovieDate().isEqual(date)) {
//				mvList.add(movie);
//			}
//		}
//		return mvList;
//	}

//	


}
