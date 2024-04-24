package com.example.apiexample.feign;


import com.example.apiexample.domain.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name="api-livro", url="https://mybookapi.s3.us-east-2.amazonaws.com")
public interface BookClient {
    @GetMapping("/books.json")
    List<Book> getBooks();
}
