package org.example.repository;

import java.util.List;

public interface CrudRepository <T, ID> {

    List<T> getAll();

    T getById(ID id);

    T save(T item);

    T update(ID id, T item);

    T delete(ID id);

}