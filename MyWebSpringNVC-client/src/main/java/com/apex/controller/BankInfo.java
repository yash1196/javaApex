package com.apex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.apex.bo.UserBOImplProxy;
import com.apex.vo.Bank;


@Controller
public class BankInfo {
	
	@RequestMapping("/addBank.do")
	public String addBank(@ModelAttribute Bank bank) {
		
		try {
			UserBOImplProxy p = new UserBOImplProxy();
			p.addBank(bank);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return "success.jsp";
	}
	

}
