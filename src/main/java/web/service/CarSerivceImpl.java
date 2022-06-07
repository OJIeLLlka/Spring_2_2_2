package web.service;

import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Car;
import java.util.List;

public class CarSerivceImpl implements CarService {

    private final CarDao carDao;

    public CarSerivceImpl() {
        carDao = new CarDaoImpl();
    }

    @Override
    public List<Car> getCars(int count) {
        return carDao.getCars(count);
    }
}
