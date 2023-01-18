package ru.geekbrains.lesson6;

import ru.geekbrains.lesson6.core.application.ConcreteNoteEditor;
import ru.geekbrains.lesson6.database.NotesDatabase;
import ru.geekbrains.lesson6.infrastructure.DatabaseContext;
import ru.geekbrains.lesson6.presentation.queries.controllers.NotesController;
import ru.geekbrains.lesson6.presentation.queries.views.NotesConsolePresenter;

public class Sample01 {

    /*
     *     * TODO: ДОМАШНЯЯ РАБОТА
     *      *  разработать UML-диаграмму классов для текущего приложения
     */
    public static void main(String[] args) {
        NotesController notesController = new NotesController(
                new ConcreteNoteEditor(new NotesConsolePresenter(), new DatabaseContext(new NotesDatabase()))
        );
        notesController.routeGetAll();
    }

}
