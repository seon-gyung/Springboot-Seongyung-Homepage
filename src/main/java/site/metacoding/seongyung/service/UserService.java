package site.metacoding.seongyung.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.seongyung.domain.user.UserRepository;

@RequiredArgsConstructor
@Service
public class UserService {

    // DI 의존성 주입
    private final UserRepository userRepository;

}
