package ie.atu.y3week2;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class week3 {
    @GetMapping("/message")
    public String getMessage()
    {
        return "Some Message";
    }

    @GetMapping("/greet/{name}")
    public String greetByName(@PathVariable String name)
    {
        return "Hello " + name;
    }
    @GetMapping("/details")
    public String details(@RequestParam String name, @RequestParam int age)
    {
        return name + " is " + age + " years old";
    }
}
