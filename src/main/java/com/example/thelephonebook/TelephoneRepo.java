package com.example.thelephonebook;

import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.Scanner;

@Repository

public class TelephoneRepo {

    private final EntityManager entityManager;


    public TelephoneRepo(EntityManager entityManager) {
        this.entityManager = entityManager;

    }



    public void save(PhoneBook phoneBook) {
        entityManager.persist(phoneBook);

    }

    public Optional<PhoneBook> findByLastNAme(String lastName) {

        return Optional.ofNullable(entityManager.find(PhoneBook.class, lastName));

    }


    public void delte(String lastName) {
        findByLastNAme(lastName).ifPresent(entityManager::remove);
    }

    }
