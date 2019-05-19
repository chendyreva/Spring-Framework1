package com.geekbrains.services;

import com.geekbrains.entities.Book;
import com.geekbrains.repositories.BooksRepository;
import org.hibernate.annotations.Fetch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.FetchType;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class BooksService {
    private BooksRepository booksRepository;

    @Autowired
    public void setBooksRepository(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    public BooksService() {
    }

    public List<Book> getAllBooksList() {
        return (List<Book>)booksRepository.findAll();
    }

    public void addStudent(Book b) {
        booksRepository.save(b);
    }

    public void removeById(Long id) {
        booksRepository.deleteById(id);
    }
}
