package com.movie.ticketbooking.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.ticketbooking.exceptions.CustomerNotFoundException;
import com.movie.ticketbooking.model.Customer;
import com.movie.ticketbooking.repo.CustomerRepo;
import com.movie.ticketbooking.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepo customerrepo;

	public CustomerServiceImpl(CustomerRepo customerrepo) {
		this.customerrepo = customerrepo;
	}

	public List<Customer> viewCustomerList() {
		return customerrepo.findAll();
	}

	public Customer addCustomer(Customer customer) {
		return customerrepo.save(customer);
	}

	public Customer updateCustomer(Customer customer) {
		return customerrepo.save(customer);

	}

	public Customer deleteCustomer(Customer customer) {
		customerrepo.delete(customer);
		return customer;
	}

}
