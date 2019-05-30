package ru.javastudy.ws.webservices.rest;

import com.geekbrains.studentsandbooks.entities.Book;
import com.geekbrains.studentsandbooks.entities.Student;


import java.util.ArrayList;
import java.util.List;


public class RestApi {

    public RestApi() {}

    @GET
    @Path("/getbooks")
    @Produces("application/xml")
    public Books getBooks() {
        Books books = new Books();
        books.setName("Some Books name");
        books.setId(1);
        return books;
    }

    @GET
    @Path("/getstudents")
    @Produces("application/xml")
    public Document getDocument() {
        List<Books> booksList = new ArrayList<>();
        booksList.add(new Books(1, "Harry Potter"));
        booksList.add(new Books(2, "The Lord of the Rings"));
        booksList.add(new Books(3, "Mysterious Island"));
        return new Student(555, "firstStudent", booksList);
    }
}
