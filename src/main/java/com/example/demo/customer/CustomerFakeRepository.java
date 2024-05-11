package com.example.demo.customer;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository(value = "fake")
public class CustomerFakeRepository implements CustomerRepo {
    @Override
    public List<Customer> getCustomers() {
        return Arrays.asList(
                new Customer(1l,"James Bond","123password", "email@gmail.com"),
                new Customer(2l,"Jamila Ahmed", "pass&872&word", "email@gmail.com")
                );
    }
}