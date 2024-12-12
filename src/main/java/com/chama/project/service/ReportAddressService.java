package com.chama.project.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.chama.project.model.ReportAddressModel;
import com.chama.project.repository.ReportAddressRepository;

@Service
public class ReportAddressService {
    
    @Autowired
    private ReportAddressRepository reportAddressRepository;

    public List<ReportAddressModel> getAllAddresses(){
        return reportAddressRepository.findAll();
    }

    public Optional<ReportAddressModel> getByZipCode(String zipCode){
        return reportAddressRepository.findByZipCode(zipCode);
    }

    public ReportAddressModel getById(Long id){
        return reportAddressRepository.findById(id).orElse(null );
    }   

}
