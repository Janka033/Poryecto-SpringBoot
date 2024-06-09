package co.edu.co.jan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class VehiclesRentalSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(VehiclesRentalSpringApplication.class, args);
	}

}
