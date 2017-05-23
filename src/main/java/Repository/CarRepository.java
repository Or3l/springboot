package Repository;

import Model.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Aurel on 5/22/17.
 */



@Repository
public interface CarRepository extends CrudRepository{

    List<Car> findAll();
}
