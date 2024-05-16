package springboot.services.food;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
public class Food {
    private @Id @GeneratedValue Long id;
    private String name;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<SubName> subNames;

    public Food() { }

    public Food(String name) {
        this.name = name;
    }

    public Food(String name, Set<SubName> subNames) {
        this.name = name;
        this.subNames = subNames;
    }
}
