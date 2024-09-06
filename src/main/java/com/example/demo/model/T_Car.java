package com.example.demo.model;


import javax.persistence.*;

@Entity

public class T_Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    @Column(name = "car_num") // 指定数据库中的列名
    private String carNum;
    private String brand;
    private Double guide_price;
    private String produce_time;
    private String car_type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCar_num() {
        return carNum;
    }

    public void setCar_num(String car_num) {
        this.carNum = car_num;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getGuide_price() {
        return guide_price;
    }

    public void setGuide_price(Double guide_price) {
        this.guide_price = guide_price;
    }

    public String getProduce_time() {
        return produce_time;
    }

    public void setProduce_time(String produce_time) {
        this.produce_time = produce_time;
    }

    public String getCar_type() {
        return car_type;
    }

    public void setCar_type(String car_type) {
        this.car_type = car_type;
    }
    @Override
    public String toString() {
        return "T_Car{" +
                "id=" + id +
                ", carNum='" + carNum + '\'' +
                ", brand='" + brand + '\'' +
                ", guide_price=" + guide_price +
                ", produce_time='" + produce_time + '\'' +
                ", car_type='" + car_type + '\'' +
                '}';
    }
}
