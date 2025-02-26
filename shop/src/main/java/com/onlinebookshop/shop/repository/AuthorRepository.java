package com.onlinebookshop.shop.repository;


import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.onlinebookshop.shop.model.Author;

@Repository
public class AuthorRepository {
	private final JdbcTemplate jdbcTemplate;

	public AuthorRepository(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	//RowMapper for Author - is a functional interface
	private RowMapper<Author> authorRowMapper = (rs, rowNum) -> 
			new Author(rs.getInt("id"), rs.getString("name"), rs.getString("country"));
	
	//CRUD Operations
	//create -> insert query
	public int save(Author author) {
		String sql = "INSERT into authors (name, country) VALUES (?, ?)";
		return jdbcTemplate.update(sql, author.getName(), author.getCountry());			
	}

	//Read (get all authors)
	public List<Author> findAll() {
		String sql = "SELECT * from authors"; //map the result set to a list of objects
		return jdbcTemplate.query(sql, authorRowMapper); //query method returs result set
	}
	
	//Read (Get author by id)
	public Author findById(int id) {
		String sql = "SELECT * from authors where id = ?";
		return jdbcTemplate.queryForObject(sql, authorRowMapper, id);
	}
	
	//Update Author
	public int update(Author author) {
		String sql = "Update authors set name=?, country=? where id=?";
		return jdbcTemplate.update(sql, author.getName(), author.getCountry(), author.getId());
	}
	
	//Delete Author
	public int delete(int id) {
		String sql = "DELETE from authors where id = ?";
		return jdbcTemplate.update(sql, id);
	}
}
