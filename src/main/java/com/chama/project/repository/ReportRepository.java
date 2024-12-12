package com.chama.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.chama.project.model.ReportModel;

@Repository
public interface ReportRepository extends JpaRepository<ReportModel, Long>{

}
