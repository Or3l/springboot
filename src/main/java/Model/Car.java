package Model;

import javax.persistence.*;

/**
 * Created by Aurel on 5/22/17.
 */
@Entity
public class Car {


    private long id;

    private User user;

    private String model;


    @Id
    @GeneratedValue
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Car() {}

    public Car(String model) {
        this.model = model;
    }

    @ManyToOne
    @JoinColumn(name="user_id")
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }



}
