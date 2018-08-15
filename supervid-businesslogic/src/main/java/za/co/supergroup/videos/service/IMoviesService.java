package za.co.supergroup.videos.service;

import za.co.supergroup.videos.dto.VideoDto;
import za.co.supergroup.videos.dto.ResultDto;
import za.co.supergroup.videos.entity.Movies;

import java.util.List;

public interface IMoviesService {

    public ResultDto addNewVideo(VideoDto videoDto);
    public ResultDto editVideo(Long id, VideoDto videoDto);
    public List<Movies> findAll();
}
