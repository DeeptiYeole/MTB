package com.movie.ticketbooking.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.movie.ticketbooking.model.Users;

@Repository
@Transactional
public interface UserRepo extends JpaRepository<Users,Integer> {

}
