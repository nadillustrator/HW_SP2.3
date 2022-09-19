package pro.sky.java.course2.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalcServiceImpl implements CalcService {

    @Override
    public int calcPlus(int num1, int num2) {
        int res = num1 + num2;
        return res;
    }

    @Override
    public int calcMinus(int num1, int num2) {
        int res = num1 - num2;
        return res;
    }

    @Override
    public int calcMultiply(int num1, int num2) {
        int res = num1 * num2;
        return res;
    }

    @Override
    public int calcDivide(int num1, int num2) {
        int res = num1 / num2;
        return res;
    }


}
