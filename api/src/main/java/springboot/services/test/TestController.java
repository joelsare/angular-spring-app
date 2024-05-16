package springboot.services.test;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/test", produces = MediaType.APPLICATION_JSON_VALUE)
public class TestController {

    @GetMapping
    public boolean getBoolean() {
        return true;
    }

    @GetMapping("/number")
    public int getNumber() {
        return 15;
    }
}
