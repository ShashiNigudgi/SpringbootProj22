package com.example.SpringbootProj2.service;

import com.example.SpringbootProj2.model.bms;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service

public class BookticketsService {

    public BookticketsService() {
        System.out.println("inside the object :::::::::");

    }

    // Implement methods to manage book tickets
    List<bms> bookTickets =  new ArrayList<>(Arrays.asList
            (new bms(1,"Kantara",212)
                 ,new bms(2,"Ranna",150)
                 ,new bms(3,"KGF",195)
                 ,new bms(4,"Vikrant Rona",135)
                 ,new bms(5,"Masterpiece",175)
                 ,new bms(6,"Robert",180)
                 ,new bms(7,"Dasa",160)
            ));
    // Get all book t

    public List<bms> getBookDetails()
    {
        //Sorting the List in descending/ascending.
        return bookTickets.stream().sorted(Comparator.comparingDouble(bms::getTicketprice).reversed())
                                    .collect(Collectors.toList());
    }

    public bms getBookTicketsIndividual(int ticketId)
    {
        return bookTickets.stream().filter(bms -> bms.getMovieid() == ticketId).findFirst()
                .orElse( new bms(100,"no movie name",0));
    }

    public void addticket(bms book)
    {
        bookTickets.add(book);

        System.out.println("after adding new  movie .."+bookTickets);
    }


    public void updateticket(bms updating) {
        int index = 0;
        for (int i =0; i <bookTickets.size(); i++)
        {
            System.out.println("check the get value : " + bookTickets.get(i).getMovieid());
            if(bookTickets.get(i).getMovieid() == updating.getMovieid())
            {
                index = i;
                break;
            }
        }
        bookTickets.set(index,updating);
    }

    public void deletingticket(bms deleting) {
        int index = 0;
        for (int i =0; i <bookTickets.size(); i++)
        {
            System.out.println("check the get value : " + bookTickets.get(i).getMoviename());
            if(bookTickets.get(i).getMoviename().equals(deleting.getMoviename()))
            {
                System.out.println("inside if looop");
                index = i;
                break;
            }
        }
        bookTickets.remove(index);
    }

    public void deletingticketbyId(int ticketid) {
        bookTickets.removeIf(bms -> bms.getMovieid() == ticketid);
    }
}
