package com.example.demo.service;

import java.util.List;

import com.example.demo.exceptions.NotesNotFoundException;
import com.example.demo.model.Notes;

public interface NoteService {
	
	public List<Notes> getAllNotes();
	public boolean insertNotes(Notes note);
	public Notes searchNotes(int pid) throws NotesNotFoundException;
	public boolean deleteNotes(int pid);
	public boolean updateNotes(Notes note);
	

}
