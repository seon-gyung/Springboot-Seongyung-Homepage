package site.metacoding.seongyung.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
import site.metacoding.seongyung.service.UserService;

@RequiredArgsConstructor
@Controller
public class UserController {

    // DI 의존성 주입
    private final UserService userService;

    // 메인 페이지
    @GetMapping({ "/" })
    public String main() {
        return "/user/mainForm";
    }

    // 로그인 페이지
    @GetMapping("/login-form")
    public String loginForm() {
        return "/user/loginForm";
    }

    // 회원가입 페이지
    @GetMapping("/join-form")
    public String joinForm() {
        return "/user/joinForm";
    }

    // 회원 정보 페이지
    @GetMapping("/userinfo-form")
    public String userinfoForm() {
        return "/user/userinfoForm";
    }
    
}
