package com.example.demo;

import java.util.List;
import java.util.Optional;




public interface NoteService {
	public List<Notes> getAllNotes();
	public Notes insertNotes(Notes note);
	
}
