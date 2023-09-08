package springboot.services.food;

import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = "api/food", produces = MediaType.APPLICATION_JSON_VALUE)
public class FoodController {
    private final FoodService foodService;

    @GetMapping()
    public ResponseEntity<List<Food>> getAllFood() {
        return ResponseEntity.ok(foodService.getAllFood());
    }
}
