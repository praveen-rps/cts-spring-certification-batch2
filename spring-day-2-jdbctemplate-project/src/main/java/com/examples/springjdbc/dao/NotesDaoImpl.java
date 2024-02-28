package com.examples.springjdbc.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.examples.springjdbc.model.Notes;
import com.examples.springjdbc.model.NotesRowMapper;

@Component

public class NotesDaoImpl implements NotesDao {

	@Autowired
	JdbcTemplate template;

	@Override
	public List<Notes> getAllNotes() {
		// TODO Auto-generated method stub
		String sql = "select * from notes";
		return template.query(sql, new NotesRowMapper());
	}

	@Override
	public boolean insertNotes(Notes note) {
		// TODO Auto-generated method stub
		String sql = "insert into notes values(?,?,?,?)";
		template.update(sql, note.getPid(), note.getAuthor(), note.getTitle(), note.getDescription());
		return true;
	}

	@Override
	public Notes searchNotes(int pid) {
		// TODO Auto-generated method stub
		String sql = "select * from notes where pid=?";
		/*
		 * return getAllNotes().stream() .filter(note->note.getPid()==pid) .map(n->n)
		 * .collect(Collectors.toList()) .get(0);
		 */
		return template.queryForObject(sql, new NotesRowMapper(), pid);
		// return template.queryForMap(sql,pid);

	}

	@Override
	public boolean deleteNotes(int pid) {
		// TODO Auto-generated method stub

		String sql = "delete from notes where pid=?";
		template.update(sql, pid);
		return true;
		// return false;
	}

	@Override
	public boolean updateNotes(Notes note) {
		// TODO Auto-generated method stub

		/*
		 * Notes nt = searchNotes(note.getPid()); boolean result=false; if (nt != null)
		 * { nt.setAuthor(note.getAuthor()); nt.setTitle(note.getTitle());
		 * nt.setDescription(note.getDescription()); result=true; } return result;
		 */
		String sql = "update notes set title=?,author=?,description =? where pid=?";
		template.update(sql,note.getTitle(),note.getAuthor(), note.getDescription(), note.getPid());
		return true;
	}

}
