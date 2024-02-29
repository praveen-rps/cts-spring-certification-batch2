package com.example.demo.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.demo.NoteService;
import com.example.demo.Notes;

@Controller
public class DemoController {
	
	@Autowired 
	NoteService service;
	
	@GetMapping("/test")
	@ResponseBody
	@ResponseStatus(HttpStatus.CREATED)
	public String test() {
		return "test";
	}
	
	@GetMapping("/home/{name}/{city}")
//	public ModelAndView home() {
	public String home(@PathVariable String name,
			@PathVariable String city, 
			Model model) {
		
		model.addAttribute("name",name);
		model.addAttribute("city",city);
		return "home";
		//return new ModelAndView("home","name","praveen");
	}
	
	@GetMapping("/register")
	public String login() {
		return "register";
	}
	
	@GetMapping("/registerData")
	public String registerData(@RequestParam int pid,
			@RequestParam String author,
			@RequestParam("title")String title,
			@RequestParam("description")String description, 
			Model model) {
		
		Notes note = new Notes(pid,author,title,description);
		service.insertNotes(note);
		List<Notes> notes = service.getAllNotes();
		model.addAttribute("notes", notes);
		return "/display";
	}

	@GetMapping("/display")
	public String displayData(Model model) {
		/*List<Notes> notes = new ArrayList<>();
		notes.add(new Notes(9001,"Kishore","Spring","EE Framework"));
		notes.add(new Notes(9002,"Mahesh","Microservices","Best Arch for complex apps"));
		notes.add(new Notes(9003,"Arjun","Salesforce","Best for Admin functions"));
		*/
		
		List<Notes> notes = service.getAllNotes();
		model.addAttribute("notes", notes);
		return "display";
	}

}
