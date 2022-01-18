package com.kurbanov__003.company;

import java.util.Comparator;
import java.util.List;

public class MovieStore implements SortAble {
    private  static final List<Movies>dataBase=JsonIO.getMovies();
    @Override
    public void printAllMovies(List<Movies> movies) {
        dataBase.stream().forEach(System.out::println);
    }

    @Override
    public void findMovie(List<Movies> movies,String name) {
    dataBase.stream().filter(movies1 -> movies1.getName().equals(name)).forEach(System.out::println);
    }                                      // бул филимдер       gary poter
    //                                        gaty poter
    @Override
    public void sortByYear(List<Movies> movies) {
dataBase.stream().sorted(Comparator.comparingInt(Movies::getYear).reversed()).forEach(System.out::println);
    }

    @Override
    public void sortByName(List<Movies> movies) {
 dataBase.stream().sorted(Comparator.comparing(Movies::getName)).forEach(System.out::println);
    }
    @Override
    public void sortByDirector(List<Movies> movies) {
dataBase.stream().map(Movies::getDirector).sorted(Comparator.comparing(Director::getFullName)).forEach(System.out::println);
    }
}
