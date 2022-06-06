package web.model;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String model;
    private String color;
    private int productionYear;
    private final List<Car> carsList = new ArrayList<>(5);

    public Car() {

    }

    public Car(String model, String color, int productionYear) {
        this.model = model;
        this.color = color;
        this.productionYear = productionYear;
    }

    public List<Car> getCarsList() {
        carsList.add(new Car("BMW", "Red", 2006));
        carsList.add(new Car("Tesla", "White", 2020));
        carsList.add(new Car("Toyota", "White", 2021));
        carsList.add(new Car("Mersedes", "Black", 2019));
        carsList.add(new Car("Audi", "Brown", 2022));
        return carsList;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }
}
