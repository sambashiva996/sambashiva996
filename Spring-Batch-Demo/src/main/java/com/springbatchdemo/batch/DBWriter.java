package com.springbatchdemo.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springbatchdemo.dao.UserRepository;
import com.springbatchdemo.model.User;

@Component
public class DBWriter implements ItemWriter<User> {
	@Autowired
	private UserRepository repo;

	public DBWriter(UserRepository userRepository) {
		this.repo = userRepository;
	}

	public void write(List<? extends User> user) throws Exception {
		System.out.println("............");
		repo.saveAll(user);
	}

}