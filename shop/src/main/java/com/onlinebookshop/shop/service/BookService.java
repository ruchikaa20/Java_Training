package com.onlinebookshop.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinebookshop.shop.model.Book;
import com.onlinebookshop.shop.repository.BookRepository;

@Service
public class BookService {
	@Autowired
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(Book book) {
        bookRepository.save(book);
    }

    public List<Book> getAllBooks() {
        return bookRepository.getAll();
    }

    public Book getBookById(int id) {
        return bookRepository.findById(id);
    }

    public int  updateBook(Book book) {
        return bookRepository.update(book);
    }

    public int deleteById(int id) {
        return bookRepository.delete(id);
    }
}
