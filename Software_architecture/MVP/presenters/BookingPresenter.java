package ru.geekbrains.lesson8.presenters;

import ru.geekbrains.lesson8.models.Table;

import java.util.Collection;
import java.util.Date;
import java.util.Optional;

public class BookingPresenter implements ViewObserver {

    private final Model model;

    private Collection<Table> tables;
    private View bookingView;

    public BookingPresenter(Model model, View view){
        this.model = model;
        this.bookingView = view;
        view.setObserver(this);
    }

    /**
     * Получение списка всех столиков
     */
    public void loadTables(){
        tables = model.loadTables();
    }

    /**
     * Отобразить список столиков на представлении
     */
    public void updateView(){
        bookingView.showTables(tables);
    }

    public void printReservationTableResult(int reservationNo){
        bookingView.printReservationTableResult(reservationNo);
    }




    /**
     * Произошло событие, пользователь нажал на кнопку резерва столика
     * @param orderDate
     * @param tableNo
     * @param name
     */
    public void onReservationTable(Date orderDate, int tableNo, String name){
        Optional<Table> table = tables.stream().filter(t -> t.getNo() == tableNo).findFirst();
        if (table.isPresent()){
            int reservationNo = model.reservationTable(orderDate, tableNo, name);
            // BookingPresenter сообщает View об успешном бронировании
            printReservationTableResult(reservationNo);
        }
    }

    //TODO: printChangeReservationTableResult

    //TODO: onChangeReservationTable

}
