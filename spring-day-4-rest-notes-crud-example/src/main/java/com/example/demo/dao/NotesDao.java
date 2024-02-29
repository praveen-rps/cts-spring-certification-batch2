package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Notes;



//@Repository
public interface NotesDao extends JpaRepository<Notes,Integer>{

	

}