package springboot.services.food;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FoodService {

    private final FoodRepository foodRepository;

    public Food createFood(String name) {
        return foodRepository.save(new Food(name));
    }

    public List<Food> getAllFood() {
        return foodRepository.findAll();
    }

    public void deleteFood(long id) { foodRepository.deleteById(id); }
}
