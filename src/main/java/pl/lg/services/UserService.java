package pl.lg.services;

import pl.lg.domain.entities.User;
import pl.lg.dtos.UserDataDTO;

public interface UserService {

    void register(UserDataDTO userDataDTO);

    User getOne(Long id);

    Long getUserId();

    User getByUsername(String username);

    User getByEmail(String email);
}
