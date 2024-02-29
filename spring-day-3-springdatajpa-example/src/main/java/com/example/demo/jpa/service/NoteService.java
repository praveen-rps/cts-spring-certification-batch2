package com.example.demo.jpa.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.jpa.model.Notes;


public interface NoteService {
	public List<Notes> getAllNotes();
	public boolean insertNotes(Notes note);
	public Optional<Notes> searchNotes(int pid);
	public boolean deleteNotes(int pid);
	public boolean updateNotes(Notes note);
	public List<Notes> findByAuthor(String author);
	public Notes findFirstByAuthor(String author);
	public List<Notes> findByPidLessThan(int pid);
	public List<Notes> findByAuthorLessThan(String author);
	public List<Notes> findByAuthorAndTitle(String author, String title);
}
