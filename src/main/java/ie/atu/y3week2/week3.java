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
    @GetMapping("/calculate")
    public String calculate(@RequestParam int num1, int num2, String operation)
    {
        int total = 0;

        switch (operation)
        {
            case "add":
                total = num1 + num2;
            break;

            case "subtract":
                total = num1 - num2;
                break;

            case "divide":
                if(num2 == 0)
                {
                    String error = "Error, cannot divide by 0";
                    return error;
                }
                else
                {
                    total = num1/num2;
                }
                break;

            case "multiply":
                total = num1 * num2;
                break;

            default:
                String Err = "Error";
                return Err;

        }
        return "" + total;
    }
}
