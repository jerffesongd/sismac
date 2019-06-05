package br.ufrn.imd.web1.sismac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories({"br.ufrn.imd.web1.sismac.repository"})
public class SismacApplication {

	public static void main(String[] args) {
		SpringApplication.run(SismacApplication.class, args);
	}

}
