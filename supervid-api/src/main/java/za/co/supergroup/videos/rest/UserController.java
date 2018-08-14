package za.co.supergroup.videos.rest;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import za.co.supergroup.videos.dto.AuthenticationDto;
import za.co.supergroup.videos.dto.ResultDto;
import za.co.supergroup.videos.service.IUserService;

@RestController
@RequestMapping("/v1")
public class UserController {

    @Autowired
    IUserService iUserService;

    @ApiOperation("Login User")
    @RequestMapping(value = "/user/login", method = RequestMethod.POST)
    public ResultDto addVideo(@RequestBody AuthenticationDto authenticationDto)throws Exception{
        if(iUserService.login(authenticationDto) != null){
            return new ResultDto("success");
        }else{
            throw new Exception("Invalid Login");
        }
    }

}
