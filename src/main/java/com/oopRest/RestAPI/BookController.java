package com.oopRest.RestAPI;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
class BookController
{
    @Autowired
    private BookRepository bookRepository;


    @GetMapping("getAll")
    public List<Book> getitem()
    {
        return (List<Book>) bookRepository.findAll();
    }

    @GetMapping(path = "/getId/{id}")
    public Optional<Book> getFindId(@PathVariable Long id)
    {
        return bookRepository.findById(id);
    }

    @PostMapping(path = "save")
    public Book saveItem(@Valid @RequestBody Book book)
    {
        Book b = new Book();
        b = book;
        bookRepository.save(b);
        return b;
    }

    @PutMapping(path = "/update/{id}")
    public Book updateItem(@PathVariable Long id,@Valid @RequestBody Book book)
    {
        Book b = new Book();
        b = book;
        bookRepository.save(b);
        return b;
    }

    @DeleteMapping(path = "remove/{id}")
    public void removeId(@PathVariable Long id)
    {
        bookRepository.deleteById(id);
    }
}