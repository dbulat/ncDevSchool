package by.training.nc.dev1.common.repository.user.impl;

import by.training.nc.dev1.common.entity.user.User;
import by.training.nc.dev1.common.repository.user.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dmbu0616 on 4/3/2017.
 */
@Service
public class UserServiceImpl implements UserService {

//    @Resource
//    UserRepository userRepository;

    @Override
    public List<User> findAllUsers() {
//        return userRepository.findAll();
        return null;
    }
}
