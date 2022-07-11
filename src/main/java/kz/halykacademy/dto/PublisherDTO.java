package kz.halykacademy.dto;

import java.util.ArrayList;

public class PublisherDTO {
    Long id;
    String publisherName;
    ArrayList<String> publishedBooks; //TODO Generic type

    public PublisherDTO() {
    }

    public PublisherDTO(Long id, String publisherName, ArrayList<String> publishedBooks) {
        this.id = id;
        this.publisherName = publisherName;
        this.publishedBooks = publishedBooks;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public ArrayList<String> getPublishedBooks() {
        return publishedBooks;
    }

    public void setPublishedBooks(ArrayList<String> publishedBooks) {
        this.publishedBooks = publishedBooks;
    }
}
