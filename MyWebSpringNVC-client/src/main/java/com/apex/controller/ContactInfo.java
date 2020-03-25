package com.apex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.apex.bo.UserBOImplProxy;
import com.apex.vo.Bank;
import com.apex.vo.Contact;

@Controller
public class ContactInfo {
	@Autowired
	Bank bank;
	
	
	@RequestMapping("/addContact.do")
	public String addContact(@ModelAttribute Contact contact, Model model) {
		
		try {
			UserBOImplProxy p =new UserBOImplProxy();
			p.addContact(contact);
			model.addAttribute("bank", this.bank);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "bankinfo.jsp";
	}

}
