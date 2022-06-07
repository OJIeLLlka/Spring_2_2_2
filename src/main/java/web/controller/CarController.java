package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarSerivceImpl;
import web.service.CarService;


@Controller
public class CarController {
    private final CarService carService;

    public CarController() {
        carService = new CarSerivceImpl();
    }

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", defaultValue = "5") int count, ModelMap model) {

        model.addAttribute("cars", carService.getCars(count));
        return "cars";
    }
}
