package com.kurbanov__003.company;

import java.util.List;

public interface FindAble {


    void findMoviesByActor(List<Movies> movies,String actors);

    void findMoviesByDirector(List<Movies> movies,String drecors);

    void findMoviesByYear(List<Movies> movies, int name);

    void findMoviesAndRoleByActor(List<Movies> movies,String roll);

    void showActorRoles(List<Movies> movies);
}
