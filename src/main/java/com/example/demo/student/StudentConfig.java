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
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student aanshi = new Student(
                    "Aanshi",
                    "aanshi.bansal@gmail.com",
                    LocalDate.of(1998, Month.APRIL, 27)
            );
            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2004, Month.APRIL, 27)
            );
            studentRepository.saveAll(
                    List.of(aanshi, alex)
            );
        };
    }

}
