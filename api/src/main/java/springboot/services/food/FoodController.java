package springboot.services.food;

import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@Log
@RequestMapping(value = "api/food", produces = MediaType.APPLICATION_JSON_VALUE)
public class FoodController {
    private final FoodService foodService;

    @GetMapping()
    public ResponseEntity<List<Food>> getAllFood() {
        return ResponseEntity.ok(foodService.getAllFood());
    }

    @PostMapping()
    public ResponseEntity<Food> createFood(@RequestBody String name) {
        log.info("creating food with name: " + name);
        return ResponseEntity.ok(foodService.createFood(name));
    }

    @DeleteMapping("/{id}")
    public void deleteFood(@PathVariable Long id) {
        foodService.deleteFood(id);
    }
}
