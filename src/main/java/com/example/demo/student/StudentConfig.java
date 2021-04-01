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
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student jack = new Student(
                    "Jack",
                    "jacknaylor@rogers.com",
                    LocalDate.of(1997, Month.MAY, 8)
            );

            Student lucy = new Student(
                    "Lucy",
                    "lucynaylor@rogers.com",
                    LocalDate.of(1999, Month.NOVEMBER, 25)
            );

            repository.saveAll(
                    List.of(jack, lucy)
            );
        };
    }
}
