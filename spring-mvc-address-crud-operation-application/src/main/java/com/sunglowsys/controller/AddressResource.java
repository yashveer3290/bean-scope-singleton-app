package com.sunglowsys.controller;


import com.sunglowsys.domain.Address;
import com.sunglowsys.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AddressResource {

    @Autowired
    AddressService addressService;

    @PostMapping("/save")
    public ResponseEntity<?> saveAddress(@RequestBody Address address){
       Address result = addressService.create(address);
       return ResponseEntity.ok().body("ADDRESS CREATED: " + result);
    }

    @PutMapping("/address/{id}")
    public ResponseEntity<?> updateAddress(@RequestBody Address address, @PathVariable("id") Integer id) {
        addressService.update(address, id);
        return ResponseEntity.ok().body("ADDRESS UPDATED ON THIS ID: " + id);
    }

    @GetMapping("/address")
    public ResponseEntity<List<Address>> findAllAddress() {
        List<Address> result = addressService.findAll();
        return ResponseEntity.ok().body(result);
    }

    @GetMapping("/address/{id}")
    public ResponseEntity<Address> getById(@PathVariable("id") Integer id) {
        Address result = addressService.findAddressById(id);
        return ResponseEntity.ok().body(result);
    }

    @DeleteMapping("/address/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id) {
        addressService.deleteAddressById(id);
        return ResponseEntity.ok().body("ADDRESS DELETED: " + id);
    }
}
