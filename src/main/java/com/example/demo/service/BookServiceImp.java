package com.example.demo.service;

import com.example.demo.dao.BookMapper;
import com.example.demo.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BookServiceImp implements BookService{
    @Autowired
    private BookMapper bookMapper;

    @Override
    public void insertBook(Book book) {
        bookMapper.insertBook(book);
    }

    @Override
    public List<Book> selectAllBook() {
        return bookMapper.selectAllBook();
    }

    @Override
    public void deleteBook(int id){
        bookMapper.deleteBook(id);
    }
}
