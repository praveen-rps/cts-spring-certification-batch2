package com.example.demo.jpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.NotesDao;
import com.example.demo.jpa.model.Notes;

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
	public boolean insertNotes(Notes note) {
		// TODO Auto-generated method stub
		dao.save(note);
		return true;
	}

	@Override
	public Optional<Notes> searchNotes(int pid) {
		// TODO Auto-generated method stub
		return dao.findById(pid);
	}

	@Override
	public boolean deleteNotes(int pid) {
		// TODO Auto-generated method stub
		dao.deleteById(pid);
		return true;
	}

	@Override
	public boolean updateNotes(Notes note) {
		// TODO Auto-generated method stub
		dao.save(note);
		return true;
	}

	@Override
	public List<Notes> findByAuthor(String author) {
		// TODO Auto-generated method stub
		
		return dao.findByAuthor(author);
		
	}

	@Override
	public Notes findFirstByAuthor(String author) {
		// TODO Auto-generated method stub
		return dao.findFirstByAuthor(author);
	}

	@Override
	public List<Notes> findByPidLessThan(int pid) {
		// TODO Auto-generated method stub
		return dao.findByPidLessThan(pid);
	}
	
	public List<Notes> findByAuthorLessThan(String author){
		return dao.findByAuthorLessThan(author);
	}
	public List<Notes> findByAuthorAndTitle(String author, String title){
		
		return dao.findByAuthorAndTitle(author, title);
	}

}
