package com.GAF.CRUD;

import com.GAF.CRUD.student.Student;
import com.GAF.CRUD.student.StudentController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class CrudApplication {


	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);

	}

//    @GetMapping
//    public String sayHello(){
//        return "Hello World";
//    }

//    @GetMapping
//    public List<String> sayHello(){
//        return List.of("Hello","World");
//    }


}
