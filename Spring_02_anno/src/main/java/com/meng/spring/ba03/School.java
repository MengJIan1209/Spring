package com.meng.spring.ba03;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("school")
public class School {

    @Value("${myschool}")
    private String name;
    @Value("${mylocation}")
    private String location;

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    public School(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public School() {
    }
}
