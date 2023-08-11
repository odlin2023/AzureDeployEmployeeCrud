package com.example.azureemployeedeployment.repository;

import com.example.azureemployeedeployment.model.NewEmployee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<NewEmployee, Long> {
    NewEmployee findByUsername(String username);
}
