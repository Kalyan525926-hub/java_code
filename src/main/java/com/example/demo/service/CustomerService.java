package com.example.demo.service;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dto.Customer;

@Service
public class CustomerService {

    @Autowired
    private RestTemplate restTemplate;
    
    @Value("${esb.base.url}")
    private String esbBaseUrl;
    
    public Customer getCustomerFromEsb(String customerId) {

        //String esbUrl = "http://external-esb-service/customers/" + customerId;
    	
    	String url = esbBaseUrl + "/customers/" + customerId;
    	
        Customer response = restTemplate.getForObject(url, Customer.class);

        return response;
    }
}
