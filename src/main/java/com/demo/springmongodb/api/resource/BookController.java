package com.demo.springmongodb.api.resource;

import com.demo.springmongodb.api.model.Book;
import com.demo.springmongodb.api.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class BookController {

    @Autowired
    private BookRepository repository;

    @PostMapping("/book")
    public String saveBook(@RequestBody Book book){
        repository.save(book);
        return "Added book with with id: " + book.getId();
    }

    @GetMapping("/book")
    public List<Book> getBooks(){
        return repository.findAll();
    }

    @GetMapping("/book/{id}")
    public Optional<Book> getBook(@PathVariable int id){
        return repository.findById(id);
    }

    @DeleteMapping("/book/{id}")
    public String deleteBook(@PathVariable int id){
        repository.deleteById(id);
        return  "Book deleted with id: " + id;
    }
}
