package org.example.solid.is_principle.service;

import org.example.solid.is_principle.entity.Entity;

// common interface to be implemented by all persistence services.
public interface PersistenceService<T extends Entity> {

  void save(T entity);

  void delete(T entity);

  T findById(Long id);
}
