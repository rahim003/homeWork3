package com.kurbanov__003.company;

import java.util.List;
import java.util.stream.Collectors;

public class FindByMap implements FindAble {
    private  static final List<Movies>dataBase=JsonIO.getMovies();
    @Override
    public void findMoviesByActor(List<Movies> movies,String actors) {
        dataBase.stream().filter(movies1-> {
            List<Cast> cast = movies1.getCast();
            List<String> collect = cast.stream().map(Cast::getFullName).collect(Collectors.toList());
            return  collect.contains(actors);

        }).forEach(System.out::println);
    }

    @Override
    public void findMoviesByDirector(List<Movies> movies,String drector) {
    dataBase.stream().filter(movies1 -> movies1.getDirector().getFullName().equals(drector)).forEach(System.out::println);
    }

    @Override
    public void findMoviesByYear(List<Movies> movies, int name) {
     dataBase.stream().filter(movies1 -> movies1.getYear()==name).forEach(System.out::println);
    }

    @Override
    public void findMoviesAndRoleByActor(List<Movies> movies,String roll) {
        dataBase.stream().filter(movies1-> {
            List<Cast> cast = movies1.getCast();
            List <String>collect1=cast.stream().map(Cast::getRole).collect(Collectors.toList());
            return  collect1.contains(roll);
        }).forEach(System.out::println);
    }

    @Override
    public void showActorRoles(List<Movies> movies) {
  movies.stream().forEach(Movies::printCast);
    }
}
