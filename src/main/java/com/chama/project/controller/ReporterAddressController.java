package com.chama.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.chama.project.model.ReportAddressModel;
import com.chama.project.service.ReportAddressService;

@RestController
@RequestMapping("/api/reportAddresses")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ReporterAddressController {
    
    @Autowired
    ReportAddressService reportAddressService;

    @GetMapping
    public List<ReportAddressModel> getAllAddresses(){
        return reportAddressService.getAllAddresses();
    }

    @GetMapping("/{id}")
    public ReportAddressModel getAddressById(@PathVariable Long id){
        return reportAddressService.getById(id);
    }

    @GetMapping("/zipCode/{zipCode}")
    public Optional<ReportAddressModel> getByZipCode(@PathVariable String zipCode){
        return reportAddressService.getByZipCode(zipCode);
    }

}
