package com.tapir.org.heroku_sb_test.jpa.repository;

import com.tapir.org.heroku_sb_test.jpa.model.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
    List<Customer> findByLastName(String lastName);
}