package com.example.demo.service;

import com.example.demo.pojo.Book;

import java.util.List;

public interface BookService {
    void insertBook(Book book);
    List<Book> selectAllBook();
    void deleteBook(int id);
}
