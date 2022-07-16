package com.movie.ticketbooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.movie.ticketbooking.exceptions.MovieNotFoundException;
import com.movie.ticketbooking.model.Movie;
import com.movie.ticketbooking.service.MovieService;

@RestController
public class MovieController {

	@Autowired
	private MovieService movieService;

	@GetMapping("/movie")
	public List<Movie> viewMovieList() throws MovieNotFoundException {
		return movieService.viewMovieList();
	}

	@PostMapping("/movie")
	public Movie addMovie(@RequestBody Movie movie) throws MovieNotFoundException {
		return movieService.addMovie(movie);
	}

	@DeleteMapping("/movie")
	public Movie removeMovie(@RequestBody int movieId) throws MovieNotFoundException {
		return movieService.removeMovie(movieId);

	}

}
