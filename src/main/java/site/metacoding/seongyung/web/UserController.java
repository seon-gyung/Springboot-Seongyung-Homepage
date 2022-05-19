package site.metacoding.seongyung.web;

import org.springframework.stereotype.Controller;

import lombok.RequiredArgsConstructor;
import site.metacoding.seongyung.service.UserService;

@RequiredArgsConstructor
@Controller
public class UserController {

    // DI 의존성 주입
    private final UserService userService;

}
