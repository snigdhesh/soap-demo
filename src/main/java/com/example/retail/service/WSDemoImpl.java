package com.example.retail.service;

import jakarta.jws.WebService;
import org.springframework.stereotype.Service;

@Service
@WebService(serviceName = "WSDemoService", targetNamespace = "http://retail.tmobile.com/service", portName = "WSDemoPort")
public class WSDemoImpl implements WSDemo {
    @Override
    public String helloWorld(String name) {
        return "Hello "+name;
        /*System.out.println("Received name: "+name);
        HelloWorldResponse helloWorldResponse=new HelloWorldResponse();
        helloWorldResponse.setHelloWorldReturn(name);
        return helloWorldResponse.toString();*/
    }
}
