package Repository;

import Model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Aurel on 5/22/17.
 */

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User findById(Long id);

    List<User> findAll();


}
