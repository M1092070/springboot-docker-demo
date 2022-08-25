package sush.docker.springbootdockerdemo2;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootDockerDemo2Application implements CommandLineRunner {
	
	@Autowired
	EmpRepository empRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDockerDemo2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Employee1 e1 = new Employee1(1,"sush",30000);
		Employee1 e2 = new Employee1(2,"nishu",50000);
		Employee1 e3 = new Employee1(3,"manish",40000);
		Employee1 e4 = new Employee1(4,"soanli",20000);
		Employee1 e5 = new Employee1(5,"paras",10000);
		Employee1 e6 = new Employee1(6,"sumit",60000);
		Employee1 e7 = new Employee1(7,"Dnyanu",35000);
		Employee1 e8 = new Employee1(8,"tanvi",90000);
		Employee1 e9 = new Employee1(9,"nvin",80000);
		Employee1 e10 = new Employee1(10,"raj",30900);
		
		
		empRepository.employee.addAll(Arrays.asList(e1,e2,e3,e4,e5,e6,e7,e8,e9,e10));
		
		
		
	}

}
