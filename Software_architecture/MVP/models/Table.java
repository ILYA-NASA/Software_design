package ru.geekbrains.lesson8.models;

import java.util.ArrayList;
import java.util.Collection;

public class Table {

    private static int counter;
    private int no;
    private Collection<Reservation> reservations = new ArrayList<>();

    {
        no = ++counter;
    }

    public int getNo() {
        return no;
    }

    public Collection<Reservation> getReservations() {
        return reservations;
    }

    @Override
    public String toString() {
        return String.format("Столик #%d", no);
    }
}
