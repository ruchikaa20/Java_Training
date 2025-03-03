package com.onlinebookshop.shop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.onlinebookshop.shop.model.Author;
import com.onlinebookshop.shop.model.Book;
import com.onlinebookshop.shop.model.Order;

@Configuration
public class AppConfig {
	@Bean
	public Author author1() {
		return new Author(1, "C. Phillips", "USA");
	}
	
	@Bean
	public Author author2() {
		return new Author(1, "C. Phillips", "USA");

	}
	
	@Bean
	public Book book1() {
		return new Book(3, "The Lean Startup", 29.99, 1);
	}
	
	@Bean
	public Book book2() {
		return new Book(4, "Ikigai", 39.99, 2);
	}
	
	@Bean
    public Order order1() {
        return new Order(3, 1, 2);
    }
    @Bean
    public Order order2() {
        return new Order(4, 1, 2);
    }

}
