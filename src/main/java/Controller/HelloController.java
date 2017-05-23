package Controller;

import Model.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Aurel on 5/22/17.
 */
@RestController
public class HelloController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/")
    public String index(){
        return "Hello";
    }

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name){
        return new Greeting(counter.incrementAndGet(), name);
    }


}
