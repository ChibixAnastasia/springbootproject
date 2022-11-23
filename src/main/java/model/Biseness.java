package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Biseness {
    @Id
    @GeneratedValue
    Long id;
    String name;
    String description;
    Boolean doneOrNot;

    public Biseness() {
    }

    public Biseness(Long id, String name, String description, Boolean doneOrNot) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.doneOrNot = doneOrNot;
    }
}
