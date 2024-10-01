/*package conlab1;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class Week3 {

    @GetMapping("/message")
    public String getMessage()
    {
        return "Some message";
    }

    @GetMapping("/details")
    public String getDetails()
    {
        return "Some other message";
    }

    @GetMapping("/greet/{name}")
    public String greetByName(@PathVariable String name)
    {
        return "Hi Rory!";
    }

    @GetMapping("/greet/{name}")
    public String Calculate(@RequestParam String name)
    {
        return "num1";
    }
}
*/