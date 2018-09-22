package io.simpleempapplication;

import java.util.List;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeApiAppController {
 @Autowired
	 private EmployeeService employeeservice;
 
	@RequestMapping("/employee")
	public List<Employee> getAllemployee() {
		return  employeeservice.getAllEmployee();
			
		}
	@RequestMapping(method=RequestMethod.POST, value="/employee")			
	public void addEmployee(@RequestBody Employee employee ) {
		employeeservice.addEmployee(employee);
	}
	
     @RequestMapping(method=RequestMethod.PUT,value="/employee/id")
     
    public void updateEmployee(@RequestBody Employee employee,@PathVariable String id) {
    	 employeeservice.updateEmployee(id, employee);
     }
     @RequestMapping(method=RequestMethod.DELETE,value="/employee/id")
     public void deleteEmployee(@RequestBody Employee employee,@PathVariable String id) {
    	 employeeservice.deleteEmployee(id);;
     }
	}

