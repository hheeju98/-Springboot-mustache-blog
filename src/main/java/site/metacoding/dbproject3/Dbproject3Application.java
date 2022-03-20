package site.metacoding.dbproject3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Dbproject3Application {

	public static void main(String[] args) {
		SpringApplication.run(Dbproject3Application.class, args);
	}

}
