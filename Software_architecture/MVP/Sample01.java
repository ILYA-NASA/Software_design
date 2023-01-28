package ru.geekbrains.lesson8;

import ru.geekbrains.lesson8.models.TableModel;
import ru.geekbrains.lesson8.presenters.BookingPresenter;
import ru.geekbrains.lesson8.views.BookingView;

import java.util.Date;

public class Sample01 {

    /**
     * TODO
     * Метод changeReservationTable должен ЗАРАБОТАТЬ!
     *
     * @param args
     */
    public static void main(String[] args) {
        TableModel model = new TableModel();
        BookingView view = new BookingView();
        BookingPresenter bookingPresenter = new BookingPresenter(model, view);

        bookingPresenter.loadTables();
        bookingPresenter.updateView();

        view.reservationTable(new Date(), 3, "Илья");

    }

}
