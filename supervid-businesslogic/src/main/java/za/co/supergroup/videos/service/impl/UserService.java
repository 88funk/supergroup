package za.co.supergroup.videos.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.co.supergroup.videos.dto.AuthenticationDto;
import za.co.supergroup.videos.entity.Users;
import za.co.supergroup.videos.repository.UserRepository;
import za.co.supergroup.videos.service.IUserService;

@Service
public class UserService implements IUserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public Users login(AuthenticationDto authenticationDto) {
        return userRepository.findUser(authenticationDto.getUsername(),authenticationDto.getPassword());
    }
}
