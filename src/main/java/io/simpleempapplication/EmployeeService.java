package io.simpleempapplication;

import java.util.List;
import java.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeerepository;
	
	private List<Employee> employees=new ArrayList<>(Arrays.asList(
			
	new Employee("emp1","name1"),
	new Employee("emp2","name2"),
	new Employee("emp3","name3")
			));
	
	public List<Employee> getAllEmployee() {
		
		//return employees;
		List<Employee> employees = new ArrayList<>();
	employeerepository.findAll().forEach(employees::add);
	return employees;
	}
 
	public void addEmployee(Employee employee) {
		employeerepository.save(employee);
		
	}
   
   public void updateEmployee(String id,Employee employee) {
	   employeerepository.save(employee);
   }
   public void deleteEmployee(String id) {
	   employeerepository.deleteById(id);
   }
}
