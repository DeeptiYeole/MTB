package com.movie.ticketbooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.movie.ticketbooking.exceptions.CustomerNotFoundException;
import com.movie.ticketbooking.model.Customer;
import com.movie.ticketbooking.service.CustomerService;



@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	



	@GetMapping("/customer")
	public List<Customer> getCustomer() {
		return customerService.viewCustomerList();
	}

	@PostMapping("/customer")
	public String addCustomer(@RequestBody Customer customer) {
		customerService.addCustomer(customer);
		return "Customer added";
	}
	
	
	@DeleteMapping("/customer")
	 public String deleteCustomer(Customer customer) {
	  customerService.deleteCustomer(customer);
	  return "Customer deleted";
	 }

//	@DeleteMapping("/customer")
//	public String deleteCustomer(Integer customerId) {
//		customerService.deleteCustomer(customerId);
//		return "Customer deleted";
//	}
}
