package com.example.SpringbootProj2.controller;

import com.example.SpringbootProj2.model.bms;
import com.example.SpringbootProj2.service.BookticketsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Method;
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
    public List<bms> getBooktickets()
    {
        System.out.println("check here ...!"+bookService.getBookDetails());
       // return new ResponseEntity<>(bookService.getBookDetails(), HttpStatus.OK);

        return bookService.getBookDetails();
    }

   @RequestMapping(value = ("/booktickets/{ticketid}"), method = RequestMethod.GET)
    public bms getBookticketsindividual(@PathVariable  int ticketid){

        return bookService.getBookTicketsIndividual(ticketid);
    }

    @RequestMapping(value = "/booktickets",method = RequestMethod.POST)
    public String addBookDetails(@RequestBody bms adding)
    {
        System.out.println("check here...!"+adding);
        bookService.addticket(adding);
        return " POST Success :: " +adding;

    }

    @PutMapping("/booktickets")
    public String UpdateBookDetails(@RequestBody bms updating)
    {
        bookService.updateticket(updating);
        return " PUT Success ::" +updating;
    }

    @DeleteMapping("/booktickets")
    public String DeleteBookDetails(@RequestBody bms deleting)
    {
        bookService.deletingticket(deleting);
        return " DELETE Success ::" +deleting;
    }
    //Delete using ticket id

    @DeleteMapping("/booktickets/{ticketid}")
    public String DeleteBookDetailsusingId(@PathVariable int ticketid)
    {
        bookService.deletingticketbyId(ticketid);
        return "DELETING BY ID IS SUCCESS ::" +ticketid;
    }
}
