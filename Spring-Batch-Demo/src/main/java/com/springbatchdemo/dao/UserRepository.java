package com.springbatchdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbatchdemo.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
