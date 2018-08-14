package za.co.supergroup.videos.service;

import za.co.supergroup.videos.dto.AuthenticationDto;
import za.co.supergroup.videos.entity.Users;

public interface IUserService {
    public Users login(AuthenticationDto authenticationDto);
}
