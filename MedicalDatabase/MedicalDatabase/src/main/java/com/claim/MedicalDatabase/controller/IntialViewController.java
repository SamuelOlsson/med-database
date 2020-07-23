package com.claim.MedicalDatabase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.claim.MedicalDatabase.Utils.EmailSender;
import com.claim.MedicalDatabase.model.Users;
import com.claim.MedicalDatabase.repository.UserRepository;
import com.claim.MedicalDatabase.service.UserServiceImpl;
import com.claim.MedicalDatabase.model.Patient;

public class IntialViewController {
	
	@Autowired
	private UserServiceImpl userService;
	
	@Autowired
	private EmailSender emergencyCheck;
	
	private UserRepository userRepository;
	
	
	
	@GetMapping("index")
	public String index(@RequestParam String email, @RequestParam String password, Model model){
		
		return "index";
	}
//	@PostMapping("index")
//	public String signin(@RequestParam String email, @RequestParam String password, Model model) {
//		
//		Users user = userRepository.findByEmail(email);
//		if(user != null && password.equals(user.getPassword())) {
//			//model.addAttribute("loggedInUser", user);
//			//user.setLoggedIn(true);
//			
//		} else {
//			model.addAttribute("error", "Invalid Credentials");
//			
//			return "index";
//		}
//		
//		return "profile";
//		
//	}
	
	
	@ModelAttribute("user")
	Users user() {
		return new Users();
	}
	
}
