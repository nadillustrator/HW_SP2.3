package pro.sky.java.course2.calculator.service;

import org.springframework.stereotype.Service;
import pro.sky.java.course2.calculator.exceptions.DivideByZeroException;


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
        if(num2 == 0){
            throw new DivideByZeroException();
        }
        int res = num1 / num2;
        return res;
    }


}