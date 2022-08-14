package kz.halykacademy.controller;

import kz.halykacademy.services.BookService;
import kz.halykacademy.controller.interfaces.BookController;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpEntity;
import org.springframework.ui.Model;

import java.awt.print.Book;
import java.util.List;

public class BookControllerImpl implements BookController {

    private BookService service;

    public BookControllerImpl(BookService service) {
        this.service = service;
    }

    @Override
    public String listAll(Model model) {
        System.out.println("---listAll");

        return returnList(model);
    }

    @Override
    public String getByID(Long id, Model model) {
        System.out.println("---getByID");

        return returnList(model);
    }

    @Override
    public String newBookForm(Model model) {
        return null;
    }

    @Override
    public String save() {
        return null;
    }

    @Override
    public String delete(Long id, Model model) {
        return null;
    }

    @Override
    public HttpEntity<FileSystemResource> image(Long id) {
        return null;
    }


    private String returnList(Model model){
        List<Book> books = service.listAll();
        System.out.println(books);

        model.addAttribute("books", books);
        return "book/list";
    }

    public String write(){}

    private FileSystemResource read(String fileName) {}



}
