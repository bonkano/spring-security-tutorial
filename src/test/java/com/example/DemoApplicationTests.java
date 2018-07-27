package com.example;

import com.example.model.Role;
import com.example.model.User;
import com.example.service.UserService;
import jdk.nashorn.internal.AssertsEnabled;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.HashSet;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	UserService userService;

	@Test
	public void contextLoads() {
	}

	@Test
	public void test01(){
		User u1 = userService.findUserByEmail("test@test.com");
		Assert.assertNotNull(u1);
	}

	@Test
	public void test02(){

	}

}
