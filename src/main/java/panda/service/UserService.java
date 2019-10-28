package panda.service;

import panda.domain.models.service.UserServiceModel;

public interface UserService {

    void registerUser(UserServiceModel userServiceModel);
    UserServiceModel loginUser(UserServiceModel userServiceModel);
}
