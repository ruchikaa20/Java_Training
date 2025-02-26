package com.onlinebookshop.shop.repository;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.onlinebookshop.shop.model.Book;

@Repository
public class BookRepository {
    private final JdbcTemplate jdbcTemplate;

    public BookRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private RowMapper<Book> bookRowMapper = (rs, rowNum) -> 
            new Book(rs.getInt("id"), rs.getString("title"), rs.getDouble("price"), rs.getInt("author_id"));

    // CRUD Operations
    public int save(Book book) {
        String sql = "INSERT into books (title, price, author_id) VALUES (?, ?, ?)";
        return jdbcTemplate.update(sql, book.getTitle(), book.getPrice(), book.getAuthorId());
    }

    public List<Book> getAll() {
        String sql = "SELECT * from books"; 
        return jdbcTemplate.query(sql, bookRowMapper); 
    }

    public Book findById(int id) {
        String sql = "SELECT * from books where id = ?";
        return jdbcTemplate.queryForObject(sql, bookRowMapper, id);
    }

    public int update(Book book) {
        String sql = "UPDATE books SET title=?, price=?, author_id=? WHERE id=?";
        return jdbcTemplate.update(sql, book.getTitle(), book.getPrice(), book.getAuthorId(), book.getId());
    }

    public int delete(int id) {
        String sql = "DELETE from books where id = ?";
        return jdbcTemplate.update(sql, id);
    }
}
