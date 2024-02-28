package com.examples.springjdbc.service;

import java.util.List;
import java.util.Map;

import com.examples.springjdbc.model.Notes;

public interface NotesService {
	
	public List<Notes> getAllNotes();
	public boolean insertNotes(Notes note);
	public Notes searchNotes(int pid);
	public boolean deleteNotes(int pid);
	public boolean updateNotes(Notes note);

}
