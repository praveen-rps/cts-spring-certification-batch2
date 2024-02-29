package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.jpa.model.Notes;

//@Query

//@Repository
public interface NotesDao extends JpaRepository<Notes,Integer>{

	public List<Notes> findByAuthor(String author);
	public Notes findFirstByAuthor(String author);
	public List<Notes> findByPidLessThan(int pid);
	public List<Notes> findByAuthorLessThan(String author);
	@Query("select n from Notes n where n.author=?1 and n.title=?2")
	public List<Notes> findByAuthorAndTitle(String author, String title);

}

/*
Crud Repository, SortingAndPaginationRepository
*/