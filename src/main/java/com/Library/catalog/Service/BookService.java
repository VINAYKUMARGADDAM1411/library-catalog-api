package com.Library.catalog.Service;

import java.util.List;

import com.Library.catalog.Beans.Book;

public interface BookService {
    Book addBook(Book book);
    List<Book> getAllBooks();
    Book getBookById(Integer id);
    boolean deleteBook(Integer id);
    Book updateAvailability(Integer id, boolean available);
}
