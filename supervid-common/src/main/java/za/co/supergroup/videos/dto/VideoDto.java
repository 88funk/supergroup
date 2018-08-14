package za.co.supergroup.videos.dto;

public class VideoDto {

    private String movieName;
    private int movieAgeRestriction;
    private String movieDirector;
    private String movieMainStars;
    private String movieDescription;

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getMovieAgeRestriction() {
        return movieAgeRestriction;
    }

    public void setMovieAgeRestriction(int movieAgeRestriction) {
        this.movieAgeRestriction = movieAgeRestriction;
    }

    public String getMovieDirector() {
        return movieDirector;
    }

    public void setMovieDirector(String movieDirector) {
        this.movieDirector = movieDirector;
    }

    public String getMovieMainStars() {
        return movieMainStars;
    }

    public void setMovieMainStars(String movieMainStars) {
        this.movieMainStars = movieMainStars;
    }

    public String getMovieDescription() {
        return movieDescription;
    }

    public void setMovieDescription(String movieDescription) {
        this.movieDescription = movieDescription;
    }

}
