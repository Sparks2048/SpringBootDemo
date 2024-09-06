package com.example.demo.service;

import com.example.demo.dao.CarRepository;
import com.example.demo.model.T_Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {
    @Autowired
    CarRepository carRepository;

    public T_Car addCar(T_Car car){
        if ( carRepository.findByCarNum(car.getCar_num()) != null) {
            throw new IllegalArgumentException("car already exists");
        }
        return carRepository.save(car);
    }
}
