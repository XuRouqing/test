package com.example.demo.controller;

import com.example.demo.pojo.Book;
import com.example.demo.service.BookService;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@org.springframework.stereotype.Controller
@RequestMapping("")
@CrossOrigin
public class Controller {

    @Autowired
    private BookService bookService;

    @ResponseBody
    @RequestMapping("/getBook")
    public JSONArray getBook(){
        List<Book> books = bookService.selectAllBook();
        JSONArray json = JSONArray.fromObject(books);
        return json;
    }

    @ResponseBody
    @RequestMapping("/delBook")
    public void delBook(int id){
        bookService.deleteBook(id);
    }

    @ResponseBody
    @RequestMapping("/addBook")
    public void insertBook(Book book){
        bookService.insertBook(book);
    }

}
