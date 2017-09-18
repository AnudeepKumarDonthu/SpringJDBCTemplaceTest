/**
 * 
 */
package com.practice.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.practice.model.User;
import com.practice.service.TestService;

/**
 * @author AnudeepKumar
 *
 */
@RestController
public class TestController {

	@Autowired
	private TestService testService;

	@RequestMapping(value = "/testMethod", method = RequestMethod.GET)
	public ModelAndView testMethod(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
		ModelAndView modelAndView = new ModelAndView("welcome");
		// modelAndView.addObject("user", new User());
		return modelAndView;
	}

	@RequestMapping(value = "/getUserDetails", method = RequestMethod.GET)
	public void getUserDetails(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
		List<User> userDetails = testService.getUserDetails();
		for (User user : userDetails) {
			System.out.println("User Id:" + user.getUserId());
			System.out.println("First Name:" + user.getFirstName());
			System.out.println("Last Name:" + user.getLastName());
			System.out.println("Address: " + user.getAddress());
			System.out.println("City: " + user.getCity());
			System.out.println("Full  User Details:" + user.toString());
		}
	}

	@RequestMapping(value = "/getUserDetailsJSON", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<User> getUserDetailsJSON(HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) {
		List<User> userDetails = testService.getUserDetails();
		/*
		 * for (User user : userDetails) { System.out.println("User Id:" +
		 * user.getUserId()); System.out.println("First Name:" + user.getFirstName());
		 * System.out.println("Last Name:" + user.getLastName());
		 * System.out.println("Address: " + user.getAddress());
		 * System.out.println("City: " + user.getCity());
		 * System.out.println("Full  User Details:" + user.toString()); }
		 */
		return userDetails;
	}

}
