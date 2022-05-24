package com.example.demo.dao;

import com.example.demo.pojo.Book;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface BookMapper {
    void insertBook(Book book);
    List<Book> selectAllBook();
    void deleteBook(int id);
}
