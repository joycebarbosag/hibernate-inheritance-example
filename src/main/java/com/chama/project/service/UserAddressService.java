package com.chama.project.service;

import com.chama.project.model.UserAddressModel;
import com.chama.project.repository.UserAddressRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserAddressService {

    @Autowired
    private UserAddressRepository userAddressRepository;

    public List<UserAddressModel> getAllAddresses(){
        return userAddressRepository.findAll();
    }

    public Optional<UserAddressModel> getByZipCode(String zipCode){
        return userAddressRepository.findByZipCode(zipCode);
    }

    public UserAddressModel getById(Long id){
        return userAddressRepository.findById(id).orElse(null );
    }    
    
}
