package com.synechron.healthInsurance.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.synechron.healthInsurance.Exception.NoSuchElementException;
import com.synechron.healthInsurance.Repository.PolicyRepository;
import com.synechron.healthInsurance.model.Policy;

@Service
public class PolicyService {
	
	@Autowired
	private PolicyRepository repo;
	
	public Policy savepolicy(Policy newPolicy) {
		
		return repo.save(newPolicy);
		
	}
	
	public List<Policy> getAllPolicies(){
		return repo.findAll();
	}
	
	
	public Policy getPolicyById(Long id) throws NoSuchElementException {
		return repo.findById(id).orElseThrow(()-> new NoSuchElementException("Cannot get Policy"+id));
		
	}
	
	public Policy updatePolicy(Long id) throws NoSuchElementException{
		return repo.findById(id).orElseThrow(()-> new NoSuchElementException("Policy Cannot be updated"+id));
	}
	
	
	public void deletePolicyByid(Long id) throws NoSuchElementException {
		 repo.findById(id).orElseThrow(()-> new NoSuchElementException("Policy not found"+id));
		 
		 
	}

}
