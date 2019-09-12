package com.Puma.demo;

import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
class CargadoBDD {

    @Bean
    CommandLineRunner initDatabase(ClienteRepositorio repository) {
        return args -> {
            log.info("Preloading " + repository.save(new Cliente("Danny","Zambrana","764234234","Obrajes","Danny@gmail.com")));
            log.info("Preloading " + repository.save(new Cliente("Pepe","Aquiles","76123123","Villa Fatima","Pepe@gmail.com")));
            log.info("Preloading " + repository.save(new Cliente("Dana","Rodriguez","7612313","Sopocachi","Dana@gmail.com")));
        };
    }
}
