package by.training.nc.dev1.common.repository.user;

import by.training.nc.dev1.common.entity.user.User;

import java.util.List;

/**
 * Created by dmbu0616 on 4/3/2017.
 */
public interface UserService {
    public List<User> findAllUsers();
}
