package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarSerivceImpl;
import web.service.CarService;

import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", required = false) Integer count, ModelMap model) {
        CarService carSerivce = new CarSerivceImpl();
        List<Car> carsList;

        if (count != null && count < 5 && count > 0) {
            carsList = carSerivce.getCars(count);
        } else {
            carsList = carSerivce.getCars(5);
        }

        model.addAttribute("cars", carsList);
        return "cars";
    }
}
