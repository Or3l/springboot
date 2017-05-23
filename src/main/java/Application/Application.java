package Application;

import Model.Car;
import Model.User;
import Repository.CarRepository;
import Repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Aurel on 5/22/17.
 */
@SpringBootApplication(scanBasePackages = { "Controller", "Service" })
@EnableJpaRepositories(basePackages = "Repository.*")
@EntityScan(basePackages = "Model")
public class Application {




    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx, CarRepository carRepository,  UserRepository userRepository) {
        return args -> {

            System.out.println("Let's inspect the beans provided by Spring Boot:");

            userRepository.save(new User("Aurelien"));
            userRepository.save(new User("Piper"));

            Car mercedes = new Car("Merdeces");
            Car bmw = new Car("BMW");
            User toro = new User("Toro");
            carRepository.save(mercedes);
            carRepository.save(bmw);


            List<Car> list = new ArrayList<>();
            list.add(mercedes);
            list.add(bmw);
            toro.setCar(list);

            userRepository.save(new User("Toro", "pute", 28, list));

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }

        };
    }
}
