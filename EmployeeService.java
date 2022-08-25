package sush.docker.springbootdockerdemo2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	EmpRepository empRepository;

	public List<Employee1> getAll() {
		// TODO Auto-generated method stub
		return empRepository.getAll();
	}

	public String add(Employee1 emp) {
		// TODO Auto-generated method stub
		return empRepository.add(emp);
	}

	
	
	
	
	
	

}
