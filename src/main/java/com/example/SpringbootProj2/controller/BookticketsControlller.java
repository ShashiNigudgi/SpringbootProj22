package com.example.SpringbootProj2.controller;

import com.example.SpringbootProj2.model.bms;
import com.example.SpringbootProj2.service.BookticketsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class BookticketsControlller {

    @Autowired
    private BookticketsService bookService;

    // this is a controller and it will get the data from service layer .
//    loc:8080/booktickets
//        -> /getAlltickets
//        ->/addSomeTickets
//        ->/mytickes
//                ->/getTickets
//                ->/addMyTickets
//                ->/kjvvkjdf
    @GetMapping("/booktickets")
    public ResponseEntity<List<bms>> getBooktickets()
    {
        System.out.println("check here ...!"+bookService.getBookDetails());
        return new ResponseEntity<>(bookService.getBookDetails(), HttpStatus.OK);

        //return "all book tickets are : "+bookService.getBookDetails();
    }
}
