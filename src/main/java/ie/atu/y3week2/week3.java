package ie.atu.y3week2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class week3 {
    @GetMapping("/message")
    public String getMessage()
    {
        return "Some Message";
    }
}
