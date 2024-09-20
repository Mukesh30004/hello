package com.coder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.coder.entity.Emp;
import com.coder.entity.Mobaile;
import com.coder.repository.EmpRepo;
import com.coder.repository.MobileRepo;

@SpringBootApplication
public class Application implements CommandLineRunner{
	
	@Autowired
    private EmpRepo empRepo;
	
	@Autowired
    private MobileRepo mobaileRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	/*	Emp emp=new Emp();
		emp.setEmpName("Mukesh");
		
		Mobaile mb=new Mobaile();
		mb.setMobilename("VIVO 1811 Y");
		
		emp.setMobaile(mb);
		
		mobaileRepo.save(mb);
		empRepo.save(emp);
		
		System.out.println("Save sucess");
		*/
		
		Emp emp = empRepo.findById(1).get();
		
	System.out.println("Name=" + emp.getEmpName());
	System.out.println("mobail=" + emp.getMobaile().getMobilename());
	}

}