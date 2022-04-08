package com.sunglowsys.web;

import com.sunglowsys.domain.Customer;
import com.sunglowsys.service.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("api")
public class CustomerResource {

    private final Logger log = LoggerFactory.getLogger(CustomerResource.class);
    private final CustomerService customerService;

    public CustomerResource(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public ModelAndView home(){
        log.debug("Web request to go to home page Customers");
        Page<Customer> page = customerService.findAll(PageRequest.of(0,20));
        return new ModelAndView("index", "customers",page.getContent());
    }

    @GetMapping("/customers")
    public ModelAndView createCustomerForm(){
        log.debug("Web request to load Customer form");
        return new ModelAndView("add-customer", "customer", new Customer());
    }

    @PostMapping("/customers/create")
    public String createCustomer(@ModelAttribute Customer customer) {
        log.debug("Web request to create Customer: {}",customer);
        customerService.save(customer);
        return "redirect:/";
    }

    @GetMapping("/customers/{id}")
    public ModelAndView updateCustomer(@PathVariable Long id){
        log.debug("Web request to update Customer :{} ",id);
        return new ModelAndView("add-customer", "customer", customerService.findById(id).get());
    }

    @GetMapping("/customers/delete/{id}")
    public String deleteCustomer(@PathVariable Long id){
        log.debug("Web request to delete customer :{}",id);
        customerService.delete(id);
        return "redirect:/";
    }

}
