package kz.halykacademy.dto;

import java.time.LocalDate;
import java.util.ArrayList;

public class BookDTO {
    Long id;
    double price;
    ArrayList<String> authorsOfBook; //TODO Generic type
    PublisherDTO publisherDTO;
    String bookName;
    int numberOfPages;
    LocalDate publicationYear;
}
