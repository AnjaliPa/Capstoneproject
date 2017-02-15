package com.spring.jobrecruitment.controllers;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.jobrecruitment.domain.JobSeeker;
import com.spring.jobrecruitment.services.JobSeekerService;

/**
 * Handles requests for the application home page.
 */

@Controller
public class HomeController {
	@Autowired
	JobSeekerService jobseekerService;


	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		
		return "RegistrationForm";
	}
	
	
	@RequestMapping(value = "/processJobSeekerRegistrationRequest", method = RequestMethod.POST)
	public ModelAndView processJobSeekerRegistrationRequest(@ModelAttribute("jobseeker") JobSeeker jobseeker, HttpSession session) 
	{
		
		ModelAndView modelView;
		jobseekerService.addNewJobSeeker(jobseeker);		
 		modelView = new ModelAndView("home");
 		session.setAttribute("jobseeker", jobseeker);
 		modelView.addObject("jobseeker", jobseeker);
		
		return modelView;
	}
	
	@RequestMapping(value = "/processLoginRequest", method = RequestMethod.POST)
	public ModelAndView processLoginRequest(@ModelAttribute("jobseeker") @Valid JobSeeker jobseeker ,BindingResult result , HttpSession session) 
	{
		
		ModelAndView modelView;
			/*  Re-present the form with error messages */
			if(!jobseekerService.CheckJobSeekerLogin(jobseeker)) {
				System.out.println("================================");
				modelView = new ModelAndView("login");
				modelView.addObject("errors", "Invalid Credentials");
				return modelView;

			} else {
				modelView = new ModelAndView("home");
		 		session.setAttribute("jobseeker", jobseeker);
		 		modelView.addObject("jobseeker", jobseeker);
				}
		
		return modelView;
	
 		
	}
	
}
