package com.example.demo.controller;

import com.example.demo.model.T_Car;
import com.example.demo.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cars")
@CrossOrigin(origins = "*",allowedHeaders = "*") // 允许从该源访问
public class CarController {
    @Autowired
    CarService carService;
    @PostMapping("/addcar")
    public ResponseEntity<T_Car> addCar(@RequestBody T_Car car){
        System.out.println(car);
        T_Car car1 = carService.addCar(car);
        return ResponseEntity.ok(car1);
    }
}
