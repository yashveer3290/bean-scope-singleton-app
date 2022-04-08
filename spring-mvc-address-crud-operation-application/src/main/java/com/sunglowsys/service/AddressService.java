package com.sunglowsys.service;


import com.sunglowsys.domain.Address;

import java.util.List;

public interface AddressService {

    Address create(Address address);

    Address update(Address address, Integer id);

    List<Address>findAll();

    Address findAddressById(Integer id);

    void deleteAddressById(Integer id);

}
