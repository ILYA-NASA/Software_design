package Software_architecture.MVP;

import Software_architecture.MVP.models.TableModel;
import Software_architecture.MVP.presenters.BookingPresenter;
import Software_architecture.MVP.views.BookingView;

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

        view.reservationTable(new Date(), 3, "Станислав");

    }

}
