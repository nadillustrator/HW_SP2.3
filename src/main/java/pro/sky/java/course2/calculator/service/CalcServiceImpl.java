package pro.sky.java.course2.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalcServiceImpl implements CalcService {

    @Override
    public String calcPlus(int num1, int num2) {
        return "" + num1 + "+" + num2 + "=" + (num1 / num2);
    }

    @Override
    public String calcMinus(int num1, int num2) {
        return "" + num1 + "-" + num2 + "=" + (num1 - num2);
    }

    @Override
    public String calcMultiply(int num1, int num2) {
        return "" + num1 + "*" + num2 + "=" + (num1 * num2);
    }

    @Override
    public String calcDivide(int num1, int num2) {
        String res;
        try {
            res = "" + num1 + "/" + num2 + "=" + (num1 / num2);
        } catch (ArithmeticException e) {
            return "Can't divide by zero!";
        }
        return res;
    }


}
