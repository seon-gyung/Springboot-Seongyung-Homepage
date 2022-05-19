package site.metacoding.seongyung.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity // 해당 파일로 시큐리티가 활성화
@Configuration // IoC 컨테이너에 등록
public class SecurityConfig extends WebSecurityConfigurerAdapter { // 내가 쓰고 싶은 메서드만 쓰기 위해 어댑터 사용

    // 인증 설정하는 메서드
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // super.configure(http); 부모 메서드 안 씀
        // csrf : 밸류에 없는 요청을 거부. 시큐리티에 기본적으로 적용되어 있다.
        http.csrf().disable(); // 포스트맨으로 테스트하기 위해 disable()
        http.authorizeRequests()
                .antMatchers("/s/**").authenticated() // 주소에 /s 가 붙으면 인증이 필요함
                .anyRequest().permitAll()
                .and()
                .formLogin()
                .loginPage("/loginForm") // 시큐리티 로그인 페이지가 아닌 내가 만든 로그인 페이지로 가도록 설정
                .defaultSuccessUrl("/"); // 정상적으로 로그인이 됐을 시 메인 페이지로 보내주기
    }
}