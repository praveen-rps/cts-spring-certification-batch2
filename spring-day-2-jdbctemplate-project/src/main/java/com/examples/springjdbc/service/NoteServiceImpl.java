package com.examples.springjdbc.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.examples.springjdbc.dao.NotesDao;
import com.examples.springjdbc.model.Notes;

@Component
public class NoteServiceImpl implements NotesService {
	
	@Autowired
	NotesDao dao;

	@Override
	public List<Notes> getAllNotes() {
		// TODO Auto-generated method stub
		return dao.getAllNotes();
	}

	@Override
	public boolean insertNotes(Notes note) {
		// TODO Auto-generated method stub
		return dao.insertNotes(note);
	}

	@Override
	public Notes searchNotes(int pid) {
		// TODO Auto-generated method stub
		return dao.searchNotes(pid);
	}

	@Override
	public boolean deleteNotes(int pid) {
		// TODO Auto-generated method stub
		return dao.deleteNotes(pid);
	}

	@Override
	public boolean updateNotes(Notes note) {
		// TODO Auto-generated method stub
		return dao.updateNotes(note);
	}

}
