package com.example.movieworkshop.repository;

import com.example.movieworkshop.model.Movie;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MoviesRepository {


    private List<Movie> movies;

    public MoviesRepository(){
        this.movies = new ArrayList<>();
        generateMoviesList();
    }

    private void generateMoviesList() {
        // Læs fra csv file og tilføj hver Movie til Listen
        try {
            Scanner input = new Scanner(new File("/Users/clbo/Tresors/KEA/programmering/kode_fra_undervisningen/05_spring_intro_2/MovieWorkShop/resources/movies.csv"));
            input.useDelimiter(";|\n");

            while(input.hasNext()){

                // Year;Length;Title;Subject;Popularity;Awards

                String year = input.next();
                String length = input.next();
                String title = input.next();
                String subject = input.next();
                String pop = input.next();
                String awards = input.next();

                Movie mo = new Movie(year, length, title, subject, pop, awards);
                movies.add(mo);
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }




    }

    public Movie getOne(int index){
        return movies.get(index);
    }

}
