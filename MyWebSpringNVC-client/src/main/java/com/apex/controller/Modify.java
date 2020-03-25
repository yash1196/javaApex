package com.apex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.apex.bo.UserBOImplProxy;
import com.apex.vo.UserInfo;



@Controller
public class Modify {

	
	@RequestMapping("modify")
	public String modify(@ModelAttribute("user") UserInfo user) {
		System.out.println("I am in the modify");
		try {
			UserBOImplProxy p = new UserBOImplProxy();
			p.updateUser(user);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return "success.jsp";
	}

}
