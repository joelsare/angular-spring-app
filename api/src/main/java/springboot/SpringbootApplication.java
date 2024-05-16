package springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springboot.services.food.FoodService;
import springboot.services.food.SubName;

import java.util.Set;

@SpringBootApplication
public class SpringbootApplication implements CommandLineRunner {
	@Autowired private FoodService foodService;

	private final Logger log = LoggerFactory.getLogger(SpringbootApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}

	@Override
	public void run(String... args)  {
		foodService.createFood("apple");
		foodService.createFood("banana");
		foodService.createFood("strawberry");
	}
}
