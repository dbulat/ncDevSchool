package by.training.nc.dev1.common.repository.user;

import by.training.nc.dev1.common.entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by dmbu0616 on 4/4/2017.
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
