package com.commsult.DockerWorkshop.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.commsult.DockerWorkshop.entity.Customer;
import com.commsult.DockerWorkshop.service.CustomerService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

@RestController
public class CustomerController {

    private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);

    @Autowired
    CustomerService customerService;

    @GetMapping("/")
    public String index() {
        logger.info("Hello Docker Workshop");
        return "Greetings from Docker Workshop!";
    }

    @GetMapping("/customers")
    public String customers() throws JsonProcessingException {
        logger.info("get all customers");
        List<Customer> customers = customerService.getAllCustomers();
        ObjectMapper mapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
        mapper.registerModule(new JavaTimeModule());
        String map = mapper.writeValueAsString(customers);
        logger.info(map);
        return map;
    }

    
    @GetMapping("/customers/create")
    public RedirectView redirectWithUsingRedirectView(
      RedirectAttributes attributes) {
        customerService.insertCustomer();
        return new RedirectView("/customers/");
    }
}
