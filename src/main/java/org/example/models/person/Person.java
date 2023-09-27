package org.example.models.person;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Person {
    private String name;
    private Number age;
    private Boolean isDriver;

    private static final String WORD_SEPARATOR = " ";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = Arrays.stream(name
                        .split(WORD_SEPARATOR))
                .map(word -> word.isEmpty()  ? word  : Character.toTitleCase(word.charAt(0)) + word.substring(1).toLowerCase())
                .collect(Collectors.joining(WORD_SEPARATOR));
    }

    public Number getAge() {
        return age;
    }

    public void setAge(Number age) {
        this.age = age;
    }

    public Boolean getIsDriver() {
        return isDriver;
    }

    public void setIsDriver(Boolean driver) {
        isDriver = driver;
    }
}
