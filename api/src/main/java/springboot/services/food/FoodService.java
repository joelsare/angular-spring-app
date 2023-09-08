package springboot.services.food;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FoodService {

    private final FoodRepository foodRepository;

    public long createFood(String name) {
        return foodRepository.save(new Food(name)).getId();
    }

    public List<Food> getAllFood() {
        return foodRepository.findAll();
    }
}
