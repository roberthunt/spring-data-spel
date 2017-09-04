package com.example.springdataspel;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringDataSpelApplicationTests
{
	@Autowired
	PersonRepository repository;

	@Test
	public void testFindById()
	{
		repository.findById((short) 1);
	}

	@Test
	public void testFindByIdUnlessIdGreaterThanFour()
	{
		repository.findByIdUnlessIdGreaterThanFour((short) 5);
	}
}
