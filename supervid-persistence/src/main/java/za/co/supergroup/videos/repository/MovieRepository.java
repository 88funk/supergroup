package za.co.supergroup.videos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import za.co.supergroup.videos.entity.Movies;

import java.math.BigInteger;
import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movies, BigInteger>{

    Movies findMovieById(@Param("movieId") Long id);
}
