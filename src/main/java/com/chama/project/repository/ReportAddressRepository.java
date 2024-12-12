package com.chama.project.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.chama.project.model.ReportAddressModel;


public interface ReportAddressRepository extends JpaRepository<ReportAddressModel, Long>{
    Optional<ReportAddressModel> findByZipCode(String zipCode);
}
