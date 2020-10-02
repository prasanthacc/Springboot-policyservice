package com.policy.service.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.policy.service.model.Policy;
import com.policy.service.service.PolicyService;

@RestController
public class ServiceController {
	
	@Autowired
	PolicyService policyService;
	
	@RequestMapping(value="/hello")
	public String hello()
	{return " hey";}

	


	@RequestMapping(value="/policy", method = RequestMethod.POST)
	public Policy createPolicy(@RequestBody Policy policy) {
		return policyService.createPolicy(policy);
		
	}
	
	
	@RequestMapping(value="/policies", method = RequestMethod.GET)
	public List<Policy> getPolicies(){
		return policyService.getPolicies();
	}
	

	@RequestMapping(value="/policyobj", method = RequestMethod.POST)
	public Policy createPolicyObj(@RequestBody Policy policy) {
		return policyService.createPolicyObj(policy);
	}	

	
	
	
}