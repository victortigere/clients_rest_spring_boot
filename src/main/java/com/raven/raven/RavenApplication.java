package com.raven.raven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("clients")
public class RavenApplication {

    public static void main(String[] args) {
        SpringApplication.run(RavenApplication.class, args);
    }

//    Show all Clients
    @GetMapping("/allclients")
    public String getClients(){
        return  "All Clients";
    }

}
