package com.project.manager.controller.test;

import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.AnnotationConfigWebContextLoader;
import org.springframework.test.context.web.WebAppConfiguration;

import com.project.manager.config.WebMvcConfig;
import com.project.manager.model.User;
import com.project.manager.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { WebMvcConfig.class }, loader = AnnotationConfigWebContextLoader.class)
@WebAppConfiguration

public class EmployeeServiceTest {

	@Autowired
	private UserService test;

	@Test
	public void testSaveMethod() {

		User employee = new User();
		employee.setFirstName("food bazaar");
		employee.setLastName("deshmukh");
		employee.setEmpID(12345678);

		test.update(employee);

		List<User> product = test.list();
		assertTrue(product.stream().filter(p -> p.getEmpID().equals(12345678)).findFirst().isPresent());
		
		//product.stream().filter(p -> p.getEmpID().equals(234)).collect(Collectors.toList());
		product.stream().sorted((p1, p2) -> p1.getLastName().compareToIgnoreCase(p2.getLastName())).collect(Collectors.toList());
		// product.sort((o1,o2) -> o1.getFirstName().compareTo(o2.getFirstName()));
		// product.forEach(d ->System.out.println(d.getFirstName()));
		// product.sort(Comparator.comparing(User::getUserId));
		product.forEach(d -> System.out.println(d.getLastName() + "" + d.getUserId()));
	}
}