package ua.yuriizhurakovskyi.citytask.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import ua.yuriizhurakovskyi.citytask.domain.User;

public interface UserService extends UserDetailsService {

    void save(User user);

}