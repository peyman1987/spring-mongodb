package com.demo.springmongodb.api.repository;

import com.demo.springmongodb.api.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, Integer> {
}
