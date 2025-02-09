package com.example.SpringbootProj2.service;

import com.example.SpringbootProj2.model.bms;
import com.example.SpringbootProj2.repository.bmsrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service

public class BookticketsService {

    @Autowired
    private bmsrepo bookTicketsrepo;

    public BookticketsService() {
        System.out.println("inside the object :::::::::");

    }

    // Implement methods to manage book tickets
//    List<bms> bookTickets =  new ArrayList<>(Arrays.asList
//            (new bms(1,"Kantara",212)
//                 ,new bms(2,"Ranna",150)
//                 ,new bms(3,"KGF",195)
//                 ,new bms(4,"Vikrant Rona",135)
//                 ,new bms(5,"Masterpiece",175)
//                 ,new bms(6,"Robert",180)
//                 ,new bms(7,"Dasa",160)
//            ));
    // Get all book t

    public List<bms> getBookDetails()
    {
        //Sorting the List in descending/ascending.
//        return bookTickets.stream().sorted(Comparator.comparingDouble(bms::getTicketprice).reversed())
//                                    .collect(Collectors.toList());
        return bookTicketsrepo.findAll();
    }

    public bms getBookTicketsIndividual(int ticketId)
    {
//        return bookTickets.stream().filter(bms -> bms.getMovieid() == ticketId).findFirst()
//                .orElse( new bms(100,"no movie name",0));
        return bookTicketsrepo.findById(ticketId).orElse(new bms());
    }

    public void addticket(List<bms> books)
    {
//        bookTickets.add(book);
//        System.out.println("after adding new  movie .."+bookTickets);
        bookTicketsrepo.saveAll(books);
    }


    public void updateticket(bms updating) {
//        int index = 0;
//        for (int i =0; i <bookTickets.size(); i++)
//        {
//            System.out.println("check the get value : " + bookTickets.get(i).getMovieid());
//            if(bookTickets.get(i).getMovieid() == updating.getMovieid())
//            {
//                index = i;
//                break;
//            }
//        }
//        bookTickets.set(index,updating);
        bookTicketsrepo.save(updating);
   }

    public void deletingticket(bms deleting) {
        bookTicketsrepo.delete(deleting);
    }

    public void deletingticketbyId(int ticketid) {
       // bookTickets.removeIf(bms -> bms.getMovieid() == ticketid);
        bookTicketsrepo.deleteById(ticketid);
    }
}
