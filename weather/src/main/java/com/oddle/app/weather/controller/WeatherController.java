package com.oddle.app.weather.controller;

import com.sun.istack.NotNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
@Slf4j
public class WeatherController {

    public Map<String, Object> getWeathers(final @NotNull @RequestParam String city) {
        return Collections.singletonMap("message", "Welcome to Oddle Backend Challenge");
    }
}