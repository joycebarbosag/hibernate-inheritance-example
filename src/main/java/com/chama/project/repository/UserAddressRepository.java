package com.chama.project.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.chama.project.model.UserAddressModel;

@Repository
public interface UserAddressRepository extends JpaRepository<UserAddressModel, Long> {

	Optional<UserAddressModel> findByZipCode(String zipCode);
}
