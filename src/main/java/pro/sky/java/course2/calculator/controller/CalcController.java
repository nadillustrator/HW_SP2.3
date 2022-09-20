package pro.sky.java.course2.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.calculator.service.CalcService;

@RestController
@RequestMapping("/calculator")
public class CalcController {
    private final CalcService calcService;

    public CalcController(CalcService calcService) {
        this.calcService = calcService;
    }

    @GetMapping()
    public String showWelcome() {
        return "Welcome!";
    }

    @GetMapping("/plus")
    public String showSum(@RequestParam int num1, @RequestParam int num2) {
        return calcService.calcPlus(num1, num2);
    }

    @GetMapping("/minus")
    public String showDifference(@RequestParam int num1, @RequestParam int num2) {
        return calcService.calcMinus(num1, num2);
    }

    @GetMapping("/multiply")
    public String showMultiplicationResult(@RequestParam int num1, @RequestParam int num2) {
        return calcService.calcMultiply(num1, num2);
    }

    @GetMapping("/divide")
    public String showDivisionResult(@RequestParam int num1, @RequestParam int num2) {
        return calcService.calcDivide(num1, num2);
    }
}
