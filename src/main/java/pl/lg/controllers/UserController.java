package pl.lg.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.lg.domain.entities.User;
import pl.lg.dtos.UserDataDTO;
import pl.lg.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("register")
    public void processRegistration(UserDataDTO dataDTO) {
        userService.register(dataDTO);
    }
}
