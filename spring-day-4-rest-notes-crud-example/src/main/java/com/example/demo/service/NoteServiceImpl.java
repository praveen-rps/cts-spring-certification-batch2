package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.NotesDao;
import com.example.demo.exceptions.NotesNotFoundException;
import com.example.demo.model.Notes;


@Service
public class NoteServiceImpl implements NoteService{
	
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
	public Notes searchNotes(int pid) throws NotesNotFoundException {
	List<Notes> notes=	dao.findAll().stream().filter(note->note.getPid()==pid)
		.map(n->n).collect(Collectors.toList());
	
	if(notes.isEmpty())
		throw new NotesNotFoundException();
	else
		return notes.get(0);
	
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

}
