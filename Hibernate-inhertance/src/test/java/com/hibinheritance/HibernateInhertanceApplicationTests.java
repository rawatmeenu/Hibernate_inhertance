package com.hibinheritance;

import com.hibinheritance.model.Address;
import com.hibinheritance.model.Employee;
import com.hibinheritance.reposiroty.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HibernateInhertanceApplicationTests {

	@Autowired
	EmployeeRepository repo;
	@Test
	void contextLoads() {
	}


	@Test
	public void testcreate() {
		Employee emp= new Employee();
		emp.setId(123);
		emp.setName("Meenu");
		Address add= new Address();
		add.setCity("dewkar");
		add.setCountry("india");
		add.setState("delhi");
		add.setStreetaddress("dwarka,sect-7");
		add.setZipcode("110075");
		emp.setAddress(add);

		repo.save(emp);

	}


}
