package ru.geekbrains.lesson5;

import ru.geekbrains.lesson5.models.Table;
import ru.geekbrains.lesson5.models.TableModel;
import ru.geekbrains.lesson5.presenters.BookingPresenter;
import ru.geekbrains.lesson5.views.BookingView;

import java.util.Date;

public class Program {

    /**
     * TODO: ДОМАШНЯЯ РАБОТА
     * Метод changeReservationTable должен ЗАРАБОТАТЬ!
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        TableModel tableModel = new TableModel();
        BookingView bookingView = new BookingView();
        BookingPresenter bookingPresenter = new BookingPresenter(tableModel, bookingView);
        bookingPresenter.loadTables();
        bookingPresenter.updateView();

        bookingView.reservationTable(new Date(), 3, "Станислав");
        bookingView.reservationTable(new Date(), 3, "Олег");
        bookingView.reservationTable(new Date(), 3, "Екатерина");
        bookingView.reservationTable(new Date(), 3, "Николай II");

        bookingView.changeReservationTable(1002, new Date(), 2, "Станислав");
    }

}
