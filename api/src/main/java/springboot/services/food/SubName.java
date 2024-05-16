package springboot.services.food;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
public class SubName {
    private @Id
    @GeneratedValue Long id;
    String mainName;
    String otherName;

    public SubName() {}
    public SubName(String mainName, String otherName) {
        this.mainName = mainName;
        this.otherName = otherName;
    }
}
