package i.am.edgedeveloper.beastmovies.entity;

/**
 * Created by OPEYEMI OLORUNLEKE on 11/5/2016.
 */

public class Movie {

    private String movieTitle;
    private String movieSummary;
    private String moviePictures;
    private String movieReleaseDate;
    private double movieRating;

    public Movie(String movieTitle, String movieSummary, String moviePictures, String movieReleaseDate, double movieRating) {
        this.movieTitle = movieTitle;
        this.movieSummary = movieSummary;
        this.moviePictures = moviePictures;
        this.movieReleaseDate = movieReleaseDate;
        this.movieRating = movieRating;


    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public String getMovieSummary() {
        return movieSummary;
    }

    public String getMoviePictures() {
        return moviePictures;
    }

    public String getMovieReleaseDate() {
        return movieReleaseDate;
    }

    public double getMovieRating() {
        return movieRating;
    }
}
