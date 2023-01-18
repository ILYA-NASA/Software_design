package ru.geekbrains.lesson6.presentation.queries.controllers;

import ru.geekbrains.lesson6.core.application.interfaces.NoteEditor;
import ru.geekbrains.lesson6.core.domain.Note;

public class NotesController {

    private final NoteEditor notesEditor;

    public NotesController(NoteEditor notesEditor){
        this.notesEditor = notesEditor;
    }

    public void routeAddNote(Note note){
        this.notesEditor.add(note);
    }

    public void routeRemoveNote(Note note){
        this.notesEditor.remove(note);
    }

    public void routeGetAll(){
        this.notesEditor.printAll();
    }


}
