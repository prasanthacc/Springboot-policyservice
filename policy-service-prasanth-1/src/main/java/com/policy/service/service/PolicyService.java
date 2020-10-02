package com.policy.service.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.policy.service.model.Customer;
import com.policy.service.model.Policy;
import com.policy.service.repository.PolicyRepository;

@Service
public class PolicyService {
	
	@Autowired
	CustomerService customerService;
	@Autowired
	PolicyRepository policyRepository;
	
	public Policy createPolicy(Policy policy)
	{
		Customer customer;
		customer = customerService.getCustomerDetails(policy.getCustomerDetails().getCustomerId());
		policy.setCustomerDetails(customer);
		return policyRepository.save(policy);

	}
	
	public List<Policy> getPolicies() {
		return policyRepository.findAll();
	}
	
	public Policy createPolicyObj(Policy policy) {

			Customer customer;
			customer = customerService.getCustomerObject(policy.getCustomerDetails().getCustomerId());
			policy.setCustomerDetails(customer);
			return policyRepository.insert(policy);

		}
	
}


