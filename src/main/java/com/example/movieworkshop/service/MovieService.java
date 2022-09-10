package com.example.movieworkshop.service;

import com.example.movieworkshop.model.Movie;
import com.example.movieworkshop.repository.MoviesRepository;

public class MovieService {
    private MoviesRepository moviesrepo;

    public MovieService() {
        this.moviesrepo = new MoviesRepository();
    }
    public Movie getFirst(){
        return moviesrepo.getOne(0);
    }


}
