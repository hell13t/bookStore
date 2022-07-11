package kz.halykacademy.dto;

import java.time.LocalDate;
import java.util.ArrayList;

public class BookDTO {
    Long id;
    double price;
    ArrayList<String> authorsOfBook; //TODO Generic type
    Long publisherID;
    String bookName;
    int numberOfPages;
    LocalDate publicationYear;

    public BookDTO() {
    }

    public BookDTO(Long id, double price, ArrayList<String> authorsOfBook, Long publisherID, String bookName, int numberOfPages, LocalDate publicationYear) {
        this.id = id;
        this.price = price;
        this.authorsOfBook = authorsOfBook;
        this.publisherID = publisherID;
        this.bookName = bookName;
        this.numberOfPages = numberOfPages;
        this.publicationYear = publicationYear;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ArrayList<String> getAuthorsOfBook() {
        return authorsOfBook;
    }

    public void setAuthorsOfBook(ArrayList<String> authorsOfBook) {
        this.authorsOfBook = authorsOfBook;
    }

    public Long getPublisherID() {
        return publisherID;
    }

    public void setPublisherID(Long publisherID) {
        this.publisherID = publisherID;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public LocalDate getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(LocalDate publicationYear) {
        this.publicationYear = publicationYear;
    }
}
