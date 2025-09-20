package com.GAF.CRUD.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args -> {
            Student Ahmed = new Student(
                    "Ahmed FOURATI",
                    "ahmedfourati44@gmail.com",
                    LocalDate.of(2001, Month.DECEMBER, 12)
            );
            Student Mariem = new Student(
                    "Mariem FOURATI",
                    "mariemfourati@ieee.org",
                    LocalDate.of(2005, Month.DECEMBER, 12)
            );

            repository.saveAll(
                    List.of(Ahmed,Mariem)
            );
        };
    }
}
