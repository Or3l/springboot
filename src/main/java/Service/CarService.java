package Service;

import Model.Car;
import Repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Aurel on 5/22/17.
 */
@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public List<Car> getCars(){
        return carRepository.findAll();
    }
}
