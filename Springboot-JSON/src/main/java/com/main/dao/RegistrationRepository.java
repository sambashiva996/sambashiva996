package com.main.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.model.Registration;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration, Integer>{

}
