package za.co.supergroup.videos.rest;


import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.co.supergroup.videos.dto.ResultDto;
import za.co.supergroup.videos.dto.VideoDto;
import za.co.supergroup.videos.entity.Movies;
import za.co.supergroup.videos.service.IMoviesService;

import java.util.List;


@RestController
@RequestMapping("/v1")
public class VideoController{

    @Autowired
    private IMoviesService IMoviesService;


    @ApiOperation("Add a new Video")
    @RequestMapping(value = "/video/create", method = RequestMethod.POST)
    public ResultDto addVideo(@RequestBody VideoDto videoDto) throws Exception{
        return IMoviesService.addNewVideo(videoDto);
    }

    @ApiOperation("Edit a Video")
    @RequestMapping(value = "/video/edit/{id}", method = RequestMethod.PUT)
    public ResultDto editVideo(@PathVariable Long id, @RequestBody VideoDto videoDto) throws Exception{
        return IMoviesService.editVideo(id,videoDto);
    }

    @ApiOperation("Get list of all Videos")
    @RequestMapping(value = "/video/list", method = RequestMethod.GET)
    public List<Movies> getAllVideo(){
        return IMoviesService.findAll();
    }

}
