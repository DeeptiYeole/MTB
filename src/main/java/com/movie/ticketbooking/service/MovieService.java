package com.movie.ticketbooking.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.movie.ticketbooking.exceptions.MovieNotFoundException;
import com.movie.ticketbooking.model.Movie;

@Service
public interface MovieService {

	Movie addMovie(Movie movie) throws MovieNotFoundException;

	Movie updateMovie(Movie movie);

	Movie removeMovie(int movieId) throws MovieNotFoundException;

	Movie viewMovie(int movieId) throws MovieNotFoundException;

	List<Movie> viewMovieList() throws MovieNotFoundException;

	List<Movie> viewMovieList(int theatreid) throws MovieNotFoundException;

	//List<Movie> viewMovieList(LocalDate date);

}
