package com.springbatchdemo.batch;

import java.util.HashMap;
import java.util.Map;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.springbatchdemo.model.User;

@Component
public class Processor implements ItemProcessor<User, User> {
	private static final Map<String, String> dept = new HashMap<>();

	public Processor() {
		dept.put("101", "cse");
		dept.put("102", "ece");
		dept.put("103", "civil");
		dept.put("104", "mech");
	}

	public User process(User user) throws Exception {
		
		System.out.println(user);
		
		String deptCode = user.getDept();
		String dept1 = dept.get(deptCode);
		user.setDept(dept1);
		
		return user;
	}
}
