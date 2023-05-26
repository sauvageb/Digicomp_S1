package fr.sauvageboris.training.jdbc.dao;


import java.util.List;
import java.util.Optional;

public interface GenericCrud<T, ID> {

    default Optional<T> findById(ID id) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    default boolean update(T t) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    default boolean create(T t) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    default boolean delete(T t) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    default List<T> findAll() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    default long count() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    default boolean existsById(ID id) {
        throw new UnsupportedOperationException("Method not implemented");
    }


}
