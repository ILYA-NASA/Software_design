package ru.geekbrains.lesson6.database;

import ru.geekbrains.lesson6.infrastructure.Database;

public class NotesDatabase implements Database {

    private NotesTable notesTable = new NotesTable();

    public NotesTable getNotesTable() {
        return notesTable;
    }


}
