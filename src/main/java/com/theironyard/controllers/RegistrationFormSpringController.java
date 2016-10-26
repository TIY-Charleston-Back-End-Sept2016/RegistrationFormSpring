package com.theironyard.controllers;

import org.h2.tools.Server;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.sql.SQLException;

/**
 * Created by zach on 10/26/16.
 */
@RestController
public class RegistrationFormSpringController {
    Server h2Server;

    @PostConstruct
    public void init() throws SQLException {
        h2Server = Server.createWebServer().start();
    }

    @PreDestroy
    public void destroy() {
        h2Server.stop();
    }
}
