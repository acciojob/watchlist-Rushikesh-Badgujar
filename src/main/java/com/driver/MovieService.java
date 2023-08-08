package com.driver;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MovieService {

    @Autowired
    MovieRepository movieRepositorys;

    public void addMovie(Movie movie){
        movieRepositorys.saveMovie(movie);
    }
    public void addDirector(Director director){
        movieRepositorys.saveDirector(director);
    }

    public void createMovieDirectorPair(String movie, String director){
        movieRepositorys.saveMovieDirectorPair(movie,director);
    }

    public Movie findMovie(String movieName){
        return movieRepositorys.findMovie(movieName);
    }
    public Director findDirector(String directorName){
        return movieRepositorys.findDirector(directorName);
    }

    public List<String> findMoviesFromDirector(String director){
        return movieRepositorys.findMoviesFromDirector(director);
    }

    public List<String> findAllMovies(){
        return movieRepositorys.findAllMovies();
    }

    public void deleteDirector(String director){
        movieRepositorys.deleteDirector(director);
    }

    public void deleteAllDirectors(){
        movieRepositorys.deleteAllDirector();
    }


    public String getDirectorName(String movie){
        return movieRepositorys.getDirectorOfMovie(movie);
    }
}
