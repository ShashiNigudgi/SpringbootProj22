package com.example.SpringbootProj2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.core.serializer.Serializer;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.beans.ConstructorProperties;
import java.io.Serializable;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class bms implements  Serializable{

    public static final long serialVersionUID =1L;
    @Id
    private int movieid;
    private String moviename;
    private long ticketprice;

    public bms(int movieid, String moviename, long ticketprice) {
        this.movieid = movieid;
        this.moviename = moviename;
        this.ticketprice = ticketprice;
    }

    @Override
    public String toString() {
        return "bms{" +
                "movieid=" + movieid +
                ", moviename='" + moviename + '\'' +
                ", ticketprice=" + ticketprice +
                '}';
    }




}
