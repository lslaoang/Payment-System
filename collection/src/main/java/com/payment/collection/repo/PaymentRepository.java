package com.payment.collection.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public  class PaymentRepository implements CrudRepository<Long, String> {

    @Override
    public <S extends Long> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Long> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Long> findById(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public Iterable<Long> findAll() {
        return null;
    }

    @Override
    public Iterable<Long> findAllById(Iterable<String> strings) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String s) {

    }

    @Override
    public void delete(Long entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {

    }

    @Override
    public void deleteAll(Iterable<? extends Long> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
