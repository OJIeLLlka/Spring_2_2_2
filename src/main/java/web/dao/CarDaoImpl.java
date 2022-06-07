package web.dao;

import web.model.Car;
import java.util.ArrayList;
import java.util.List;

public class CarDaoImpl implements CarDao {
    private final List<Car> carsList = new ArrayList<>(5);

    public CarDaoImpl() {
        carsList.add(new Car("BMW", "Red", 2006));
        carsList.add(new Car("Tesla", "White", 2020));
        carsList.add(new Car("Toyota", "White", 2021));
        carsList.add(new Car("Mersedes", "Black", 2019));
        carsList.add(new Car("Audi", "Brown", 2022));
    }

    @Override
    public List<Car> getCars(int count) {

        if (count >= carsList.size()) {
            return carsList;
        }

        return carsList.stream().limit(count).toList();
    }
}
