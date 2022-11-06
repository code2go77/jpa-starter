package com.code2go.controller;

import com.code2go.controller.model.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {

    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("test user");

        Employee employee1 = new Employee();
        employee1.setId(2);
        employee1.setName("User 2");

        Employee employee2 = new Employee();
        employee2.setId(3);
        employee2.setName("User 3");

        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("sampleApp");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        entityManager.persist(employee);
        entityManager.persist(employee1);
        entityManager.persist(employee2);

        transaction.commit();


    }
}
