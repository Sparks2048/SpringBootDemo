package com.example.demo.dao;

import com.example.demo.model.T_Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository  extends JpaRepository<T_Car, Long> {
    //todo
    T_Car findByCarNum(String carNum);
}
