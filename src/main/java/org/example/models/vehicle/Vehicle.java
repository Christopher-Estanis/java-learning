package org.example.models.vehicle;

import org.example.models.person.Person;

import java.util.List;

public class Vehicle {
    private String brand;
    private String type;
    private List<Person> people;

    public int countPeople () {
        return this.people.size();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }
}
