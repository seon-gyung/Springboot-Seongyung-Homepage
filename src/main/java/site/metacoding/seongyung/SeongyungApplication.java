package site.metacoding.seongyung;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing // JPA Auditing 활성화
@SpringBootApplication
public class SeongyungApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeongyungApplication.class, args);
	}

}
