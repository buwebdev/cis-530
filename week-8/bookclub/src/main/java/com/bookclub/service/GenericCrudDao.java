package com.bookclub.service;

import java.util.List;

public interface GenericCrudDao<E, K> {
    void add(E entity);
    void update(E entity);
    boolean remove(E entity);
    List<E> list(); // Return a list of objects of type E.
    E find(K key); // Return an object of type E by type K value.
}
