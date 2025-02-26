package com.onlinebookshop.shop.repository;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.onlinebookshop.shop.model.Order;

@Repository
public class OrderRepository {
    private final JdbcTemplate jdbcTemplate;

    public OrderRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private RowMapper<Order> orderRowMapper = (rs, rowNum) -> 
            new Order(rs.getInt("id"), rs.getInt("book_id"), rs.getInt("quantity"));

    // CRUD Operations
    public int save(Order order) {
        String sql = "INSERT into orders (id, book_id, quantity) VALUES (?, ?, ?)";
        return jdbcTemplate.update(sql, order.getId(), order.getBookId(), order.getQuantity());
    }

    public List<Order> getAll() {
        String sql = "SELECT * from orders"; 
        return jdbcTemplate.query(sql, orderRowMapper); 
    }

    public Order findById(int id) {
        String sql = "SELECT * from orders where id = ?";
        return jdbcTemplate.queryForObject(sql, orderRowMapper, id);
    }

    public int update(Order order) {
        String sql = "UPDATE orders SET book_id=?, quantity=? WHERE id=?";
        return jdbcTemplate.update(sql, order.getBookId(), order.getQuantity(), order.getId());
    }

    public int delete(int id) {
        String sql = "DELETE from orders where id = ?";
        return jdbcTemplate.update(sql, id);
    }
}
