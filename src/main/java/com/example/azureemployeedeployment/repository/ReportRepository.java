package com.example.azureemployeedeployment.repository;

import com.example.azureemployeedeployment.model.Report;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportRepository extends JpaRepository<Report, Long> {
}

