package ru.geekbrains.lesson8.views;

import ru.geekbrains.lesson8.models.Table;
import ru.geekbrains.lesson8.presenters.View;
import ru.geekbrains.lesson8.presenters.ViewObserver;

import java.util.Collection;
import java.util.Date;

public class BookingView implements View {


    private ViewObserver observer;

    public void setObserver(ViewObserver observer){
        this.observer = observer;
    }

    public void showTables(Collection<Table> tables){
        for (Table table: tables) {
            System.out.println(table);
        }
    }

    public void reservationTable(Date orderDate, int tableNo, String name){
        observer.onReservationTable(orderDate, tableNo, name);
    }

    /**
     * Действие клиента (пользователь нажал на кнопку бронирования), бронирование столика
     * @param reservationNo
     */
    public void printReservationTableResult(int reservationNo){
        System.out.printf("Столик успешно забронирован. Номер вашей брони: #%d\n", reservationNo);
    }

    /**
     * Действие клиента (пользователь нажал на кнопку изменения бронирования),
     * старую бронь отменить
     * новую бронь добавить
     *
     * @param oldReservation
     * @param orderDate
     * @param tableNo
     * @param name
     */
    public void changeReservationTable(int oldReservation, Date orderDate, int tableNo, String name){

    }

}
