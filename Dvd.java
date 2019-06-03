package com.trimindtech.training.home05;

public class Dvd {
    String movieTitle;
    double lengthOfMovie;
    MovieStatus movieStatus;

    public Dvd(String movieTitle, double lengthOfMovie) {
        this.movieTitle = movieTitle;
        this.lengthOfMovie = lengthOfMovie;
        this.movieStatus = MovieStatus.IN;

    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public double getLengthOfMovie() {
        return lengthOfMovie;
    }

    public void setLengthOfMovie(double lengthOfMovie) {
        this.lengthOfMovie = lengthOfMovie;
    }

    public MovieStatus getMovieStatus() {
        return movieStatus;
    }

    public void setMovieStatus(MovieStatus movieStatus) {
        this.movieStatus = movieStatus;
    }

    @Override
    public String toString() {
        return "Dvd{" +
                "movieTitle='" + movieTitle + '\'' +
                ", lengthOfMovie=" + lengthOfMovie +
                ", movieStatus=" + movieStatus +
                '}';
    }
}