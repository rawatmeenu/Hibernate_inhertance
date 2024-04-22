package com.hibinheritance.reposiroty;

import com.hibinheritance.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
