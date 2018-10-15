package com.project.manager.controller.test;

import static org.junit.Assert.assertTrue;

import java.util.Comparator;
import java.util.List;

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
		employee.setFirstName("hi");
		employee.setLastName("sagar");
		employee.setEmpID(234);

		test.save(employee);

		List<User> product = test.list();
		assertTrue(product.stream().filter(p -> p.getEmpID().equals(622228)).findFirst().isPresent());
		// product.sort((o1,o2) ->
		// o1.getFirstName().compareTo(o2.getFirstName()));
		// product.forEach(d ->System.out.println(d.getFirstName()));
		product.sort(Comparator.comparing(User::getUserId));
		product.forEach(d -> System.out.println(d.getFirstName() + "" + d.getUserId()));
	}
}