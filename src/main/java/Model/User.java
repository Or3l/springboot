package Model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Aurel on 5/22/17.
 */
@Entity
public class User {


    private long id;

    private String name;

    private String work;

    private int age;

    private List<Car> car;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public User( String name) {
        this.name = name;
    }

    public User() {
        super();
    }

    public User(String name, String work, int age, List<Car> car) {
        this.name = name;
        this.work = work;
        this.age = age;
        this.car = car;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    public List<Car> getCar() {
        return car;
    }

    public void setCar(List<Car> car) {
        this.car = car;
    }


}
