package masterSpringMvc2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.DispatcherServletAutoConfiguration;

@SpringBootApplication
public class MasterSpringMvc2Application {

	public static void main(String[] args) {
		//DispatcherServletAutoConfiguration
		SpringApplication.run(MasterSpringMvc2Application.class, args);
	}
}
