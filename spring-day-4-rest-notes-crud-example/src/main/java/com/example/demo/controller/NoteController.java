package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exceptions.NotesNotFoundException;
import com.example.demo.model.Notes;
import com.example.demo.service.NoteService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/notes")
public class NoteController {
	
	
	@Autowired NoteService service;
	
	@DeleteMapping("/{pid}")
	public boolean deleteNotes(@PathVariable int pid) {
		return service.deleteNotes(pid);
	}
	
	@GetMapping("/{pid}")
	public Notes searchNotes(@PathVariable int pid) throws NotesNotFoundException{
		return service.searchNotes(pid);
	}
	
	
	@GetMapping
	public List<Notes> showAllNotes(){
		return service.getAllNotes();
	}
	
	@PostMapping
	public Notes inserNotes(@RequestBody @Valid Notes note) {
		service.insertNotes(note);
		return note;
	}

	
}
