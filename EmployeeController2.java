package sush.docker.springbootdockerdemo2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")

public class EmployeeController2 {
	
	@Autowired
	EmployeeService empService;
	
	@GetMapping
	public List<Employee1>getAll(){
		return empService.getAll();
	}
	
	@GetMapping("/add")
	public String getAll(@RequestBody Employee1 emp){
		return empService.add(emp);
	}
	
	

}
