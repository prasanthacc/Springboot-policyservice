package com.policy.service.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.policy.service.model.Customer;

@Service
public class CustomerService {

	public Customer getCustomerDetails(String customerId) {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Customer> response = restTemplate.getForEntity("http://localhost:8081/mongoCustomers/"+customerId, Customer.class);
		Customer customer = response.getBody();
		
		return customer;
		
		// TODO Auto-generated method stub
		
	}
	
	public Customer getCustomerObject(String customerId) {
		RestTemplate restTemplate = new RestTemplate();
		
		Customer  response_obj = restTemplate.getForObject("http://localhost:8081/mongoCustomers/{customerId}", Customer.class,customerId);
		return response_obj;
		
		// TODO Auto-generated method stub
		
	}
	
	

}
