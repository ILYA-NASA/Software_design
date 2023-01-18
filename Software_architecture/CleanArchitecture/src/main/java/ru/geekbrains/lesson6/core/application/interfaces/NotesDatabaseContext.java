package ru.geekbrains.lesson6.core.application.interfaces;

import ru.geekbrains.lesson6.core.domain.Note;

import java.util.Collection;

public interface NotesDatabaseContext {

    Collection<Note> getAll();
    boolean saveChanges();

}
