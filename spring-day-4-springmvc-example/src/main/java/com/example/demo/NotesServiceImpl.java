package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import jakarta.transaction.Transactional;

@Service
@Transactional
public class NotesServiceImpl implements NoteService{
	
	@Autowired
	NotesDao dao;

	@Override
	public List<Notes> getAllNotes() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Notes insertNotes(Notes note) {
		// TODO Auto-generated method stub
		return dao.save(note);
	}

	

}
