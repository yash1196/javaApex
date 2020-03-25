package com.apex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.apex.bo.UserBOImplProxy;



@Controller
public class Delete {

	
	@RequestMapping("delete")
	public String view(@RequestParam("ssn") String ssn) {
		
		System.out.println(ssn);
		try {
			UserBOImplProxy p =new UserBOImplProxy();
			if(p.deleteUser(ssn)) {
				return "success.jsp";
			}	
			
		} catch (Exception e) {
			// TODO: handle exception
		}
			
		return "Error.jsp";	
	}

}
