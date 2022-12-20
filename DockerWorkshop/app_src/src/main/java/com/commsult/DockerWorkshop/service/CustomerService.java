package com.commsult.DockerWorkshop.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.commsult.DockerWorkshop.entity.Customer;
import com.commsult.DockerWorkshop.repository.CustomerRepository;
import com.github.javafaker.Faker;

@Service
public class CustomerService {
    
    private static final Logger logger = LoggerFactory.getLogger(CustomerService.class);

    @Autowired
    CustomerRepository customerRepository;

    public List<Customer> getAllCustomers() {
        List<Customer> customers = customerRepository.findAll();

        return customers;
    }

    public void insertCustomer() {
        Faker faker = new Faker();

        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();

        Customer newCust = new Customer();
        newCust.setFirstName(firstName);
        newCust.setLastName(lastName);

        Customer createdCust = customerRepository.save(newCust);

        logger.info("created customer first name: " + createdCust.getFirstName());
        logger.info("created customer last name: " + createdCust.getLastName());

        return;
    }

}
