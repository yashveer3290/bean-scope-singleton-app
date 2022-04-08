package com.sunglowsys.service;

import com.sunglowsys.domain.Customer;
import com.sunglowsys.repository.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{
    private final Logger log = LoggerFactory.getLogger(CustomerServiceImpl.class);
    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer save(Customer customer) {
     log.debug("Request to save Customer: {} ",customer);
        return customerRepository.save(customer);
    }

    @Override
    public Customer update(Customer customer) {
        log.debug("Request to update Customer: {}",customer);
        return customerRepository.save(customer);
    }

    @Override
    public Page<Customer> findAll(Pageable pageable) {
        log.debug("Request to findAll Customer: {}",pageable.toString());
        return customerRepository.findAll(pageable);
    }

    @Override
    public Optional<Customer> findById(Long id) {
        log.debug("Request to findById Customer: {} ",id);
        return Optional.empty();
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete Customer: {}",id);
        customerRepository.deleteById(id);

    }
}
