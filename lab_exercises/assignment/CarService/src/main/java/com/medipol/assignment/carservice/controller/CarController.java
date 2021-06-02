package com.medipol.assignment.carservice.controller;

import com.medipol.assignment.carservice.service.CarService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/carservice")
public class CarController {

    private final CarService carService;

    public CarController(CarService carService){
        this.carService = carService;
    }

    @GetMapping("/{carType}")
    public String getCarType(@PathVariable String carType){
        // Servisten dönen response(cevap) u al ve yolla

        return carService.getCarType(carType);
    }




}
