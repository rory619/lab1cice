package conlab1;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

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
}
