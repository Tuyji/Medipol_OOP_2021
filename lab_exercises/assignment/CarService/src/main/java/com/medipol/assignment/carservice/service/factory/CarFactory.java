package com.medipol.assignment.carservice.service.factory;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
public class CarFactory {


    private static final Map<String, Car> carMap = new HashMap<>();

    static {
        carMap.put("Cabrio", new CabrioCar());
        carMap.put("Sedan", new SedanCar());
        carMap.put("Hatchback", new HatchbackCar());
    }


    public Optional<Car> getCar(String carType) {
        return Optional.ofNullable(carMap.get(carType));
    }

}
