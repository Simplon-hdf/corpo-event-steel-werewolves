package com.yferdin.corpo_event;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {
	@Autowired
	EventRepository eventRepo;
	
	@GetMapping("/")
	public String showHome(Model model) {
		List<Event> events = eventRepo.findAll();
		model.addAttribute("events", events);
		return"home";
	}
}
