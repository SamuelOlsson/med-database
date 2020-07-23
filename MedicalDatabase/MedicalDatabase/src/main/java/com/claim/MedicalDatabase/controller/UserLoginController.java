package com.claim.MedicalDatabase.controller;





import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.claim.MedicalDatabase.model.Patient;
import com.claim.MedicalDatabase.model.Users;
import com.claim.MedicalDatabase.repository.UserRepository;
import com.claim.MedicalDatabase.service.UserServiceImpl;
import com.claim.MedicalDatabase.validation.UserDataValidation;


@Controller 
@SessionAttributes("loggedInUser")
public class UserLoginController {
	
	@Autowired
	private UserServiceImpl userService;
	
	
	private UserRepository userRepository;
	
	@Autowired
	private UserDataValidation dataValidation;

	
	
	
	public UserLoginController(UserServiceImpl userService, UserRepository userRepository, UserDataValidation dataValidation) {
		super();
		this.userService = userService;
		this.userRepository = userRepository;
		this.dataValidation = dataValidation;
	}
	

	
	@PostMapping("index")
	public String login(@RequestParam String email, @RequestParam String password, Model model) {
		
		Users user = userRepository.findByEmail(email);
		if(user != null && password.equals(user.getPassword())) {
			//model.addAttribute("loggedInUser", user);
			
		} else {
			model.addAttribute("error", "Invalid Credentials");
			
			return "index";
		}
		
		return "profile";
		
		
	}
	

	@GetMapping("profile")
	public String profile(Model model) {
		return "profile";
	}
	
	
	
	@GetMapping("logout")
	public String logout(Model model, WebRequest request, SessionStatus status, RedirectAttributes redirect) {
		
//		status.setComplete();
//		request.removeAttribute("loggedInUser", WebRequest.SCOPE_SESSION);
		
		return "redirect:/login";
	}
	
	@GetMapping("register")
	public String register(Model model) {
		model.addAttribute("msg", "Register");
		model.addAttribute("hidden", "");
		model.addAttribute("users", new Users());
		model.addAttribute("action", "register");
		return "register";
	}
	
	
	@PostMapping("register")
	public String register(@ModelAttribute Users users, Model model, BindingResult result, RedirectAttributes redirect) {
		
		try {
			dataValidation.validate(users, result);
			if (result.hasErrors()) {
				model.addAttribute("error", "Required* fields");
				model.addAttribute("hidden", "");
				model.addAttribute("action", "register");
				
				return "register";
			}
			
			users.setRole("USER");
			userRepository.save(users);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "index";
	}
	
	@GetMapping("viewUserData")
	public String viewUserData(Model model) {
		return "viewUserData";
	}
	
	@PostMapping("viewUserData")
	public String showUser(@RequestParam String email, @RequestParam String password, Model model) {
		Users user = userRepository.findByEmail(email);
		if(user != null && password.equals(user.getPassword())) {
			model.addAttribute("result", user);
			
		} else {
			model.addAttribute("error", "Invalid Credentials");
			
			return "profile";
		}
		
		return "viewUserDataSucess";
		 
	}
	@GetMapping("viewUserDataSucess")
	public String viewUserDataSucess(Model model,Users user) {
		
		return "viewUserDataSucess";
	}
	
	@GetMapping("editUserData")
	public String editUserData(Model model, @RequestParam Long id, @ModelAttribute Users users) {
		model.addAttribute("users.id", id);
		return "editUserData";
	}
	@PostMapping("editUserData")
	public String saveEditedUserData(@ModelAttribute Users users, BindingResult result, Model model) {
		try {
			dataValidation.validate(users, result);
			if (result.hasErrors()) {
				model.addAttribute("error", "Required* fields");
				//model.addAttribute("hidden", "");
				model.addAttribute("action", "save");
				return "viewPatientData";
			}
			
			userRepository.save(users);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return "profile";
	}
	
	@GetMapping("deleteUserData")
	public String deletePatientData(Model model, @RequestParam Long id) {
		userRepository.deleteById(id);
		
		return "redirect:http://localhost:3500/MedicalDatabase/";
	}
	
}