package za.co.supergroup.videos.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.co.supergroup.videos.dto.ResultDto;
import za.co.supergroup.videos.dto.VideoDto;
import za.co.supergroup.videos.entity.Movies;
import za.co.supergroup.videos.repository.MovieRepository;
import za.co.supergroup.videos.service.IMoviesService;

import java.util.List;

@Service
public class MoviesService implements IMoviesService{

    @Autowired
    MovieRepository movieRepository;

    private static final Logger LOG = LoggerFactory.getLogger(MoviesService.class);

    @Override
    public ResultDto addNewVideo(VideoDto videoDto){
        try{
            Movies movies = new Movies();
            movies.setMovieAgeRestriction(videoDto.getMovieAgeRestriction());
            movies.setMovieDescription(videoDto.getMovieDescription());
            movies.setMovieDirector(videoDto.getMovieDirector());
            movies.setMovieName(videoDto.getMovieName());
            movies.setMovieStars(videoDto.getMovieMainStars());

            if(movieRepository.save(movies) != null ){
                LOG.info("Successfully Added {}",videoDto.getMovieName());
            }
        }catch (Exception e){
            LOG.error("FAILED ADD");
            LOG.error(e.getMessage());
        }
        return new ResultDto("Movie added");
    }

    @Override
    public ResultDto editVideo(Long id, VideoDto videoDto){
        try{
            Movies movies = movieRepository.findMovieById(id);
            if(movies != null){
                movies.setMovieAgeRestriction(videoDto.getMovieAgeRestriction());
                movies.setMovieDescription(videoDto.getMovieDescription());
                movies.setMovieDirector(videoDto.getMovieDirector());
                movies.setMovieName(videoDto.getMovieName());
                movies.setMovieStars(videoDto.getMovieMainStars());
                if(movieRepository.save(movies) != null ){
                    LOG.info("Successfully updated {}",videoDto.getMovieName());
                }else{
                    throw new Exception("Failed to save");
                }
            }
        }catch (Exception ex){
            LOG.error("FAILED UPDATE");
            LOG.error(ex.getMessage());
        }
        return new ResultDto("Movie updated");
    }

    @Override
    public List<Movies> findAll() {
        return movieRepository.findAll();
    }
}
