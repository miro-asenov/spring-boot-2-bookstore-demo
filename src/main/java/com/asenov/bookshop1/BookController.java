package com.asenov.bookshop1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {

    @Autowired
    private BookRepository bookRepo;

    @GetMapping("/")
    public String readAll(Model model){
        
        List<Book> books = bookRepo.findAll();
        model.addAttribute("books", books);
        return "read";
    }
    
}