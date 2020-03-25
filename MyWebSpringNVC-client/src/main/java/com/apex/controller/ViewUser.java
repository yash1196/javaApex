package com.apex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.apex.bo.UserBOImplProxy;
import com.apex.vo.UserInfo;



@Controller
public class ViewUser {


	
	@RequestMapping("view")
	public ModelAndView view(@RequestParam("ssn") int ssn) {
		System.out.println("I am in the view");
		System.out.println(ssn);
		ModelAndView mv = new ModelAndView();
		try {
			UserBOImplProxy p = new UserBOImplProxy();
			UserInfo user = p.getUser(ssn);
			mv.addObject("user", user);
			mv.setViewName("registration.jsp");
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		return mv;
	}

}
