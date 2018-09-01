package com.ach.microserviceb.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

/**
 * Very simple controller class to return a couple of values pair when receive a GET request
 *
 * @author antonio.chavez
 */

@RestController("/config")
public class ConfigController {

    private static final Logger logger = LoggerFactory.getLogger(ConfigController.class);

    @Value("${config.value}")
    private String configValue;

    @GetMapping
    public Map<String, String> getMicroserviceConfig() {
        logger.debug("Request received to return microservice B config");

        return Collections.singletonMap("config",configValue);
    }

}
