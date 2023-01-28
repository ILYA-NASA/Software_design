package ru.geekbrains.lesson8.presenters;

import ru.geekbrains.lesson8.models.Table;

import java.util.Collection;
import java.util.Date;

public interface Model {

    Collection<Table> loadTables();

    int reservationTable(Date reservationDate, int tableNo, String name);



}
