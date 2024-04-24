package com.example.apiexample.service;


import com.example.apiexample.domain.Book;
import com.example.apiexample.feign.BookClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookClient bookClient;

    public BookService(BookClient _bookClient){
        this.bookClient = _bookClient;
    }
    public List<Book> getBooksFromLibrary(){
        return this.bookClient.getBooks();
    }
}
