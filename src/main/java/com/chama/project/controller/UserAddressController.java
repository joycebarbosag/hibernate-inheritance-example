package com.chama.project.controller;

import com.chama.project.model.UserAddressModel;
import com.chama.project.service.UserAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/addresses")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserAddressController {

	@Autowired
    UserAddressService userAddressService;

    @GetMapping
    public List<UserAddressModel> getAllAddresses(){
        return userAddressService.getAllAddresses();
    }

    @GetMapping("/{id}")
    public UserAddressModel getAddressById(@PathVariable Long id){
        return userAddressService.getById(id);
    }

    @GetMapping("/zipCode/{zipCode}")
    public Optional<UserAddressModel> getByZipCode(@PathVariable String zipCode){
        return userAddressService.getByZipCode(zipCode);
    }
}
