package com.example.movieworkshop.model;

public class Movie {

    String year;
    String length;
    String title;
    String subject;
    String pop;
    String awards;

    public Movie(String year, String length, String title, String subject, String pop, String awards) {
        this.year = year;
        this.length = length;
        this.title = title;
        this.subject = subject;
        this.pop = pop;
        this.awards = awards;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getPop() {
        return pop;
    }

    public void setPop(String pop) {
        this.pop = pop;
    }

    public String getAwards() {
        return awards;
    }

    public void setAwards(String awards) {
        this.awards = awards;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "year='" + year + '\'' +
                ", length='" + length + '\'' +
                ", title='" + title + '\'' +
                ", subject='" + subject + '\'' +
                ", pop='" + pop + '\'' +
                ", awards='" + awards + '\'' +
                '}';
    }
}
