package com.example.MyFirstRest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.MyFirstRest.model.User;

@RestController
@RequestMapping("/api")
public class UserController 
{
	@RequestMapping("showUser")	
	public ModelAndView getEmployee(User user)
	{
		ModelAndView mv = new ModelAndView();			
		mv.addObject("obj",user);
		mv.setViewName("showUser.jsp");
		return mv;
	}	
	
}
