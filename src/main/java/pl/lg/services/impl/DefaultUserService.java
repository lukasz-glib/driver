package pl.lg.services.impl;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.lg.domain.entities.User;
import pl.lg.domain.entities.UserScore;
import pl.lg.domain.repositories.RoleRepository;
import pl.lg.domain.repositories.UserRepository;
import pl.lg.dtos.UserDataDTO;
import pl.lg.services.UserService;

@Service
@Transactional
@Slf4j
public class DefaultUserService implements UserService {

    private final UserRepository userRepository;
    private final ModelMapper mapper;
    private final PasswordEncoder passwordEncoder;
    private final RoleRepository roleRepository;

    public DefaultUserService(UserRepository userRepository, ModelMapper mapper, PasswordEncoder passwordEncoder,
                              RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.mapper = mapper;
        this.passwordEncoder = passwordEncoder;
        this.roleRepository = roleRepository;
    }

    @Override
    public void register(UserDataDTO userDataDTO) {
        User user = mapper.map(userDataDTO, User.class);
        user.setActive(Boolean.TRUE);
        UserScore userScore = new UserScore();
        userScore.setScore(0);
        user.setUserScore(userScore);
        user.setPassword(passwordEncoder.encode(userDataDTO.getPassword()));
        user.getRoles().add(roleRepository.findByName("ROLE_USER"));
        log.debug("Rejestracja nowego użytkownika: {}", user);
        userRepository.save(user);
        log.debug("Nowy użytkownik został zarejestrowany: {}", user);
    }
}
