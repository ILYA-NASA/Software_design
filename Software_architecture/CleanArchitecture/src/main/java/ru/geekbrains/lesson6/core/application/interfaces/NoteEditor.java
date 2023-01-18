package ru.geekbrains.lesson6.core.application.interfaces;

import ru.geekbrains.lesson6.core.domain.Note;

public interface NoteEditor extends Editor<Note, Integer>  {

    void printAll();
}
