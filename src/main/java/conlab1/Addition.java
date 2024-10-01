package conlab1;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@RestController
public class Addition {

    @GetMapping("/addition")
    public String GetAddition(
            @RequestParam int num1,
            @RequestParam int num2) {
        int sum = num1 + num2;
        return "The answer is " + sum;
    }
    @GetMapping("/subtraction")
    public String GetSubtraction(
            @RequestParam int num1,
            @RequestParam int num2) {
        int sum = num1 - num2;
        return "The answer is " + sum;
    }
    @GetMapping("/division")
    public String GetDivision(
            @RequestParam int num1,
            @RequestParam int num2) {
        int sum = num1 / num2;
        return "The answer is " + sum;
    }
    @GetMapping("/multiplication")
    public String GetMultiplication(
            @RequestParam int num1,
            @RequestParam int num2) {
        int sum = num1 * num2;
        return "The answer is " + sum;
    }

}
