package ru.geekbrains.lesson6.core.application;

import ru.geekbrains.lesson6.core.application.interfaces.NoteEditor;
import ru.geekbrains.lesson6.core.application.interfaces.NotesDatabaseContext;
import ru.geekbrains.lesson6.core.application.interfaces.NotesPresenter;
import ru.geekbrains.lesson6.core.domain.Note;

import java.util.Collection;
import java.util.Date;
import java.util.Optional;

public class ConcreteNoteEditor implements NoteEditor {

    private final NotesDatabaseContext dbContext;
    private final NotesPresenter notesPresenter;

    public ConcreteNoteEditor(
            NotesPresenter notesPresenter,
            NotesDatabaseContext notesDatabaseContext
    ){
        dbContext = notesDatabaseContext;
        this.notesPresenter = notesPresenter;
    }

    @Override
    public boolean add(Note item) {
        dbContext.getAll().add(item);
        dbContext.saveChanges();
        return true;
    }

    @Override
    public boolean edit(Note item) {
        if (item == null)
            return false;
        Optional<Note> note = getById(item.getId());
        if (note.isEmpty())
            return false;
        note.get().setTitle(item.getTitle());
        note.get().setDetails(item.getDetails());
        note.get().setEditDate(new Date());
        dbContext.saveChanges();
        return true;
    }

    @Override
    public boolean remove(Note item) {
        dbContext.getAll().remove(item);
        dbContext.saveChanges();
        return true;
    }

    @Override
    public Optional<Note> getById(Integer id) {
        return dbContext.getAll().stream().filter(p -> p.getId() == id).findFirst();
    }

    @Override
    public Collection<Note> getAll() {
        return dbContext.getAll();
    }

    @Override
    public void printAll() {
        notesPresenter.printAll(getAll());
    }
}
