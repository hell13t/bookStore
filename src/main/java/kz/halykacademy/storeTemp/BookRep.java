package kz.halykacademy.storeTemp;

import java.awt.print.Book;
import java.util.List;

public interface BookRep {

    List<Book> listAll();

    Book getOne(long id);

    Book save(Book book);

    void delete(long id);
}
