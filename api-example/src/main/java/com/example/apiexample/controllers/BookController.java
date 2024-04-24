package com.example.apiexample.controllers;


import com.example.apiexample.domain.Book;
import com.example.apiexample.service.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService _bookService){
        this.bookService = _bookService;
    }

    @GetMapping()
    public ResponseEntity<List<Book>> getBooks(){
        return ResponseEntity.ok().body(this.bookService.getBooksFromLibrary());
    }
}
