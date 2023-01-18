package ru.geekbrains.lesson6.core.application.interfaces;

import ru.geekbrains.lesson6.core.domain.Note;

import java.util.Collection;
import java.util.Optional;

public interface Editor<T, TId> {

    boolean add(T item);
    boolean edit(T item);
    boolean remove(T item);
    Optional<T> getById(TId id);
    Collection<T> getAll();

}
