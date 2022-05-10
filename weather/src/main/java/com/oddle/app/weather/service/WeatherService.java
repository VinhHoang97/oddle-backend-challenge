package com.oddle.app.weather.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    private RestTemplate restTemplate;

    @Autowired
    public WeatherService(final RestTemplate restTemplate){

    }
}
