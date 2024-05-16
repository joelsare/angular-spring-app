package springboot.demo;

import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import springboot.services.food.Food;
import springboot.services.food.FoodRepository;
import springboot.services.food.FoodService;
import springboot.services.food.SubName;

import java.util.List;
import java.util.Set;

@SpringBootTest
class SpringbootApplicationTests {

	@Autowired
	FoodService foodService;
	@Autowired
	FoodRepository foodRepository;

	@Test
	void searchTest() {
		createFood();
		Sort sort = Sort.by("subNames_mainName", "name");
		Pageable pageable = PageRequest.of(0, 25, sort);
		Page<Food> foodList = foodRepository.findAll(pageable);
		for (Food f: foodList) {
			System.out.println(f.getName());
		}
		System.out.println("foodList.getTotalElements(): " + foodList.getTotalElements());
		System.out.println("foodList.getSize(): " + foodList.getSize());
	}

	void createFood() {
		Set<SubName> set;
		for (int i = 0; i < 10; i++) {
			set = Set.of(new SubName("a", "f"), new SubName("e", "t"));
			foodRepository.save(new Food("testFood2", set));

			set = Set.of(new SubName("s", "e"));
			foodRepository.save(new Food("testFood1", set));
		}
	}

	@Test
	void contextLoads() {
	}

}
