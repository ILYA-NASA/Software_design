package ru.geekbrains.lesson8.models;

import java.util.Date;

public class Reservation {

    private static int counter;
    private  int id;
    private Date date;
    private String name;


    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    {
        id = ++counter;
    }

    public Reservation(Date date, String name){
        this.date = date;
        this.name = name;
    }


}
