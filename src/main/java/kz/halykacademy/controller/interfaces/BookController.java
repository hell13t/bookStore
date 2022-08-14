package kz.halykacademy.controller.interfaces;

import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/book")
public interface BookController {

    @GetMapping
    String listAll(Model model);

    @GetMapping("/{id}")
    String getByID(@PathVariable Long id, Model model);

    @GetMapping("/{new}")
    String newBookForm(Model model);

    @PostMapping
    String save();

    @GetMapping("/delete/{id}")
    String delete(@PathVariable Long id, Model model);

    @GetMapping(value = "/image/{id}")
    HttpEntity<FileSystemResource> image(@PathVariable Long id);

}
