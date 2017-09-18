/**
 * 
 */
package com.practice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.practice.model.User;
import com.practice.repository.TestRepository;

/**
 * @author AnudeepKumar
 *
 */
public class TestService {
	
	@Autowired
	private TestRepository testRepository;
	
	public List<User> getUserDetails(){
		return testRepository.getUserDeails();
	}

}
