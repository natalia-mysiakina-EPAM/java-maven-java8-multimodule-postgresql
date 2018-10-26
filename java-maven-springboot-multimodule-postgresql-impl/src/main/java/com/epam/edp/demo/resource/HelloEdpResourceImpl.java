package com.epam.edp.demo.resource;

import com.epam.edp.demo.HelloEdpResource;
import com.epam.edp.demo.service.HelloEdpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Roman_Martseniuk
 */
@RestController
public class HelloEdpResourceImpl implements HelloEdpResource {

    @Autowired
    private HelloEdpService service;

    @Override
    public String hello() {
        return String.format("Hello, %s!", service.getValue());
    }
}
