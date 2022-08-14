package kz.halykacademy.implementation;

import kz.halykacademy.dto.BookDTO;
import kz.halykacademy.provider.BookProvider;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class BookProviderImpl implements BookProvider {

    ArrayList<BookDTO> bookList = new ArrayList<>(){
        {
            add(new BookDTO(1L, 1000.0, new ArrayList<String>(), 1L,"bookName1", 100, LocalDate.now()));
            add(new BookDTO(2L, 2000.0, new ArrayList<String>(), 2L,"bookName1", 200, LocalDate.now()));
            add(new BookDTO(3L, 3000.0, new ArrayList<String>(), 3L,"bookName1", 300, LocalDate.now()));
        }
    };

    @Override
    public List<BookDTO> getAll() {
        return bookList;
    }
}
