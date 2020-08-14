package com.demo.controller;

import com.demo.entity.Weather;
import com.demo.model.WeatherSummary;
import com.demo.repository.IWeatherRepository;
import com.demo.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    @Value("${api.key}")
    private String apiId;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    Service service;

    @Autowired
    IWeatherRepository weatherRepository;

    @GetMapping("/{cityName}")
    public void getWeatherInfo(@PathVariable String cityName) {
        WeatherSummary weatherSummary = restTemplate.getForObject("https://api.openweathermap.org/data/2.5/weather?q=" + cityName + "&api_key=" + apiId, WeatherSummary.class);
        Weather weather = new Weather(weatherSummary);
        weatherRepository.save(weather);
    }

    @GetMapping("/palindrome")
    public ResponseEntity<Boolean> getPalindrome(@RequestParam String s) {
        boolean b = service.getPalindrome(s);
        return new ResponseEntity<>(b, HttpStatus.OK);
    }
}
