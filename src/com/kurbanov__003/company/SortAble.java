package com.kurbanov__003.company;

import java.util.List;

public interface SortAble {

    void printAllMovies(List<Movies> movies);

    void findMovie(List<Movies> movies,String name);

    void sortByYear(List<Movies> movies);

    void sortByName(List<Movies> movies);

    void sortByDirector(List<Movies> movies);
}
