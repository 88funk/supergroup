package za.co.supergroup.videos.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@NamedQuery(name = "Movies.findMovieById",
        query = "Select mov FROM Movies mov WHERE mov.id=:movieId"
)
@Table(name="movies")
public class Movies implements Serializable {
//id, movie_name, movie_age, movie_director, movie_stars, movie_description, date_added
    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name="movie_name")
    private String movieName;

    @Column(name="movie_age")
    private int movieAgeRestriction;

    @Column(name="movie_director")
    private String movieDirector;

    @Column(name="movie_stars")
    private String movieStars;

    @Column(name="movie_description")
    private String movieDescription;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="date_added", insertable=false)
    private Date dateAdded;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getMovieStars() {
        return movieStars;
    }

    public void setMovieStars(String movieStars) {
        this.movieStars = movieStars;
    }

    public String getMovieDescription() {
        return movieDescription;
    }

    public void setMovieDescription(String movieDescription) {
        this.movieDescription = movieDescription;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

}
