package com.apex.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.apex.bo.UserBOImplProxy;
import com.apex.vo.Contact;
import com.apex.vo.User;


@Controller
public class PersonalController {
	
	@Autowired
	Contact contact;

	@Autowired
	User user;

	
	@RequestMapping("/entryAddUser.do")
	public String entryAddUser(@ModelAttribute User user, Model model) {
		System.out.println("I am in the entryAddUser.do method");
		model.addAttribute("user", this.user);
		return "personInfo.jsp";
	}

	@RequestMapping("/processAddUser.do")
	public String addPersonalInfo(@ModelAttribute User user, Model model) {
		try {
			UserBOImplProxy proxy = new UserBOImplProxy();
			proxy.addUser(user);
			model.addAttribute("contact", this.contact);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "contactInfo.jsp";
	}
	
}


