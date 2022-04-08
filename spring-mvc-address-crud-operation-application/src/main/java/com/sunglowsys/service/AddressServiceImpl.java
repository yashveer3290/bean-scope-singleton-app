package com.sunglowsys.service;


import com.sunglowsys.domain.Address;
import com.sunglowsys.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressRepository addressRepository;


    @Override
    public Address create(Address address) {
        return addressRepository.save(address);
    }

    @Override
    public Address update(Address address, Integer id) {
        return addressRepository.save(address);
    }

    @Override
    public List<Address> findAll() {
        return addressRepository.findAll();
    }

    @Override
    public Address findAddressById(Integer id) {
        return addressRepository.findById(id).get();
    }

    @Override
    public void deleteAddressById(Integer id) {
        addressRepository.deleteById(id);
    }

}
