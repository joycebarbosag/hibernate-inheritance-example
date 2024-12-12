package com.chama.project.repository;

import com.chama.project.model.FirefighterModel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FirefighterRepository extends JpaRepository<FirefighterModel, Long> {
    
}
