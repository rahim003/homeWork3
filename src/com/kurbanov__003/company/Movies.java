package com.kurbanov__003.company;

import java.util.List;

public class Movies {

    private String name;
    private int year;
    private String description;
    private Director director;
    private List<Cast> cast;

    void printCast() {
        int counter = 1;
        for (Cast s : cast) {
            System.out.printf("%s)   Fullname: %s\n", counter, s.getFullName());
            System.out.println("     Role: " + s.getRole());
            counter++;
        }
    }

    public List<Cast> getCast() {
        return cast;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getDescription() {
        return description;
    }

    public Director getDirector() {
        return director;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "name='" + name + '\n' +
                ", year=" + year+'\n' +
                ", description='" + description + '\n' +
                ", director=" + director +'\n'+
                ", cast=" + cast +'\n'+
                "}";

    }
}
