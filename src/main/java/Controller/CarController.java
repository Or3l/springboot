package Controller;

import Model.Car;
import Service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Aurel on 5/22/17.
 */
@RestController
public class CarController {


    @Autowired
    private CarService carService;

    @RequestMapping("/cars")
    public List<Car> getCars(){
        return this.carService.getCars();
    }
}
