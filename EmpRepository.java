package sush.docker.springbootdockerdemo2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class EmpRepository {
	
	public List<Employee1>employee = new ArrayList<Employee1>();

	public List<Employee1> getAll() {
		// TODO Auto-generated method stub
		return employee;
	}

	public String add(Employee1 emp) {
		employee.add(emp);
		return "successfully add";
	}

	
	
}
