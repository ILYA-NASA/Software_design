package ru.geekbrains.lesson8.presenters;

import ru.geekbrains.lesson8.models.Table;

import java.util.Collection;

public interface View {

    void showTables(Collection<Table> tables);
    void setObserver(ViewObserver observer);

    void printReservationTableResult(int reservationNo);
}
