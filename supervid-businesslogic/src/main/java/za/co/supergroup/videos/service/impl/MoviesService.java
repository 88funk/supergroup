package za.co.supergroup.videos.service.impl;

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

    @Override
    public ResultDto addNewVideo(VideoDto videoDto) throws Exception{
        Movies movies = new Movies();
        movies.setMovieAgeRestriction(videoDto.getMovieAgeRestriction());
        movies.setMovieDescription(videoDto.getMovieDescription());
        movies.setMovieDirector(videoDto.getMovieDirector());
        movies.setMovieName(videoDto.getMovieName());
        movies.setMovieStars(videoDto.getMovieMainStars());

        if(movieRepository.save(movies) != null ){
            return new ResultDto("Movie added");
        }
        throw new Exception("Cannot Add Movie");
    }

    @Override
    public ResultDto editVideo(Long id, VideoDto videoDto) throws Exception{


        Movies movies = movieRepository.findMovieById(id);
        if(movies != null){
            movies.setMovieAgeRestriction(videoDto.getMovieAgeRestriction());
            movies.setMovieDescription(videoDto.getMovieDescription());
            movies.setMovieDirector(videoDto.getMovieDirector());
            movies.setMovieName(videoDto.getMovieName());
            movies.setMovieStars(videoDto.getMovieMainStars());
            if(movieRepository.save(movies) != null ){
                return new ResultDto("Movie updated");
            }else{
                throw new Exception("Failed to save");
            }
        }
        throw new Exception("Failed to Update");
    }

    @Override
    public List<Movies> findAll() {
        return movieRepository.findAll();
    }
}
