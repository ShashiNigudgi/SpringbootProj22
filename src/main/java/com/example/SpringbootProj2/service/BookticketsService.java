package com.example.SpringbootProj2.service;

import com.example.SpringbootProj2.model.bms;
import org.springframework.stereotype.Service;

import java.util.*;
@Service

public class BookticketsService {

    public BookticketsService() {
        System.out.println("inside the object :::::::::");

    }

    // Implement methods to manage book tickets
    List<bms> bookTickets = Arrays.asList
            (new bms(1,"Kantara",212)
                 ,new bms(2,"Ranna",150)
                 ,new bms(3,"KGF",195)
                 ,new bms(4,"Vikrant Rona",135)
                 ,new bms(5,"Masterpiece",175)
                 ,new bms(6,"Robert",180)
                 ,new bms(7,"Dasa",160)
            );
    // Get all book t

    public List<bms> getBookDetails()
    {
        return bookTickets;
    }



}
