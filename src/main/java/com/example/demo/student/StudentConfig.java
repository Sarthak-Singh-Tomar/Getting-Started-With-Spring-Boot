package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student john = new Student(
                    "john",
                    "john@abc.com",
                    LocalDate.of(2000, Month.JANUARY, 2)
            );

            Student kate = new Student(
                    "kate",
                    "kate@abc.com",
                    LocalDate.of(2004, Month.JANUARY, 2)
            );

            repository.saveAll(
                    List.of(john, kate)
            );
        };
    }
}
