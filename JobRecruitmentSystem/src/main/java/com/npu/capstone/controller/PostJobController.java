package com.npu.capstone.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.npu.capstone.domain.PostJob;
import com.npu.capstone.service.PostJobService;


//@Controller
public class PostJobController {/*
	@Autowired
	PostJobService postjobService;
	
	@RequestMapping(value = "/searchJobForm", method = RequestMethod.POST)
	public ModelAndView viewAvailableProductForm(@ModelAttribute("customer")BindingResult result, HttpSession session)
	{
		List<PostJob> searchjobList;
		
		ModelAndView modelView;
		searchjobList = postjobService.getJobList();		
		
 		modelView = new ModelAndView("viewJobsList");
 		modelView.addObject("searchjobList", searchjobList);
 		session.setAttribute("searchjobList",searchjobList);
 		
		return modelView;
	}		
*/}
