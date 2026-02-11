package com.example.demo;

<<<<<<< HEAD
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Endpoint 1";
    }

    @GetMapping("/status")
    public String status() {
        return "Application is running - Endpoint 2";
    }
}
=======
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Customer;
import com.example.demo.service.CustomerService;

@RestController
public class DemoController {

    @Autowired
    public CustomerService customerService;

    @GetMapping("/customer/{id}")
    public Customer getCustomer(@PathVariable("id") String id) {
        return customerService.getCustomerFromEsb(id);
    }
}
>>>>>>> uat
