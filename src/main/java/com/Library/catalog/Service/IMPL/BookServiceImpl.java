package com.Library.catalog.Service.IMPL;

import org.springframework.stereotype.Service;

import com.Library.catalog.Beans.Book;
import com.Library.catalog.Service.BookService;

import java.util.*;

@Service
public class BookServiceImpl implements BookService {

    private final Map<Integer, Book> bookStorage = new HashMap<>();
    private int nextId = 1;

    @Override
    public Book addBook(Book book) {
        book.setId(nextId++);
        bookStorage.put(book.getId(), book);
        return book;
    }

    @Override
    public List<Book> getAllBooks() {
        return new ArrayList<>(bookStorage.values());
    }

    @Override
    public Book getBookById(Integer id) {
        return bookStorage.get(id);
    }

    @Override
    public boolean deleteBook(Integer id) {
        return bookStorage.remove(id) != null;
    }

    @Override
    public Book updateAvailability(Integer id, boolean available) {
        Book book = bookStorage.get(id);
        if (book != null) {
            book.setAvailable(available);
        }
        return book;
    }
}
