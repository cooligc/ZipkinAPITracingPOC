package com.cooligc.labs.zipkin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
public class MyResource {

    private static final Logger LOG = Logger.getLogger(MyResource.class.getName());


    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{username}")
    public String sayHello(@PathVariable("username") String username){
        System.out.println("Got invoke 1");
        LOG.log(Level.INFO,"Got invoke 1");
        String version = restTemplate.getForEntity("http://localhost:8080/",String.class).getBody();
        System.out.println("Got invoke 3");
        LOG.log(Level.INFO,"Got invoke 3");
        return "Hello ! "+username +" \n\n Request version = "+version;
    }

    @GetMapping("/")
    public String getVersion(){
        System.out.println("Got invoke 2");
        LOG.log(Level.INFO,"Got invoke 2");
        return UUID.randomUUID().toString();
    }

}
