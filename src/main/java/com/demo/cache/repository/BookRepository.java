package com.demo.cache.repository;

import com.demo.cache.model.Book;

public interface BookRepository {

    Book getByIsbn(String isbn);

}
