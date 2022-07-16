package com.movie.ticketbooking.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.movie.ticketbooking.exceptions.CustomerNotFoundException;
import com.movie.ticketbooking.model.Customer;

@Service
public interface CustomerService {

	//Customer getCustomer(int customerId);

	 Customer addCustomer(Customer customer) ;

	 Customer updateCustomer(Customer customer) throws CustomerNotFoundException;

	 Customer deleteCustomer(Customer customer);
	 
	 List<Customer> viewCustomerList();


}
