package com.demo.repository;


import com.demo.entity.Weather;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IWeatherRepository extends JpaRepository<Weather, String> {
}
