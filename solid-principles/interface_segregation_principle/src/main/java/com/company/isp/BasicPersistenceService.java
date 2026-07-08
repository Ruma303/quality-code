package com.company.isp;

import com.company.noisp.Entity;

import java.util.List;

// Interfaccia base per salvataggio e cancellazione
public interface BasicPersistenceService<T extends Entity> {
    void save(T entity);
    void delete(T entity);
    T findById(Long id);
}

// Interfaccia specializzata solo per entità che possono essere ricercate per nome
public interface NamedEntityPersistenceService<T extends Entity> {
    List<T> findByName(String name);
}
