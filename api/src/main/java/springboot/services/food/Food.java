package springboot.services.food;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Food {
    private @Id @GeneratedValue Long id;
    private String name;

    public Food() { }

    public Food(String name) {
        this.name = name;
    }
}
