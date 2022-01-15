package com.example.demo.tourism;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class TourismConfig
        {

    @Bean
    CommandLineRunner commandLineRunner(
            TourismRepository repository)
        {
        return args ->
        {
            Tourism david = new Tourism(
                    "david@gmail.com",
                    "david"
            );
            Tourism king = new Tourism(
                    "king@gmail.com",
                    "king"
            );
            repository.saveAll(
                    List.of(david, king)
            );
        };
        }
        }
