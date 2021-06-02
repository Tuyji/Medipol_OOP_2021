package com.medipol.assignment.carservice.service.impl;

import com.medipol.assignment.carservice.service.CarService;
import com.medipol.assignment.carservice.service.factory.Car;
import com.medipol.assignment.carservice.service.factory.CarFactory;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CarServiceImpl implements CarService {


    // 1. Cartype : Sedan ---> Sedan car has been produced.
    // 2. Cartype : Cabrio ---> Cabrio car has been produced.
    // 3. Cartype : Hatchback ---> Hatchback car has been produced.

    private final CarFactory carFactory;

    public CarServiceImpl(CarFactory carFactory) {
        this.carFactory = carFactory;
    }

    @Override
    public String getCarType(String carType) {
        Optional<Car> car = carFactory.getCar(carType);

        if(car.isPresent())
            return car.get().getType();
        else
            return "No car type has been found";
    }

}
