package web.service;

import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

public class CarSerivceImpl implements CarService {
    private final List<Car> carList = new ArrayList<>(new Car().getCarsList());

    @Override
    public List<Car> getCars(int count) {
        List<Car> queredCars = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            queredCars.add(carList.get(i));
        }
        return queredCars;
    }
}
