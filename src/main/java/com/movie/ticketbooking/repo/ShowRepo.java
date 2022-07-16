package com.movie.ticketbooking.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.movie.ticketbooking.model.Show;

@Repository
@Transactional
public interface ShowRepo extends JpaRepository<Show,Integer>{

}
