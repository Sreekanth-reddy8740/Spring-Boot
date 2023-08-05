package com.Sreekanth.SpringBoot.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.Sreekanth.SpringBoot.entity.RegisterEntity;
import com.Sreekanth.SpringBoot.service.RegisterService;

@Controller
public class RegisterController {

	@Autowired
	private RegisterService registerService;
	
	@RequestMapping("/saveUserDetails")
	public ModelAndView saveUser(RegisterEntity registerEntity) {
		registerService.saveDetails(registerEntity);
		return new ModelAndView("index.jsp");
	}
}
