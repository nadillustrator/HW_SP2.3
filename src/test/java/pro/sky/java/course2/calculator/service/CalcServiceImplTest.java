package pro.sky.java.course2.calculator.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pro.sky.java.course2.calculator.constants.TestConstants;

import static org.junit.jupiter.api.Assertions.*;

public class CalcServiceImplTest {
    CalcServiceImpl calc = new CalcServiceImpl();


    @Test
    public void shouldReturnCorrectSumResultPositiveNums() {
        int resExpected = calc.calcPlus(TestConstants.POSITIVE, TestConstants.POSITIVE);
        int resActual = TestConstants.POSITIVE + TestConstants.POSITIVE;
        assertEquals(resExpected, resActual);
    }

    @Test
    public void shouldReturnCorrectMinusResultPositiveNums() {
        int resExpected = calc.calcMinus(TestConstants.POSITIVE, TestConstants.POSITIVE);
        int resActual = TestConstants.POSITIVE - TestConstants.POSITIVE;
        assertEquals(resExpected, resActual);
    }

    @Test
    public void shouldReturnCorrectMultiplyResultPositiveNums() {
        int resExpected = calc.calcMultiply(TestConstants.POSITIVE, TestConstants.POSITIVE);
        int resActual = TestConstants.POSITIVE * TestConstants.POSITIVE;
        assertEquals(resExpected, resActual);
    }

    @Test
    public void shouldReturnCorrectDivideResultPositiveNums() {
        int resExpected = calc.calcDivide(TestConstants.POSITIVE, TestConstants.POSITIVE);
        int resActual = TestConstants.POSITIVE / TestConstants.POSITIVE;
        assertEquals(resExpected, resActual);
    }

    @Test
    public void shouldReturnCorrectSumResultOneNegativeNum() {
        int resExpected = calc.calcPlus(TestConstants.POSITIVE, TestConstants.NEGATIVE);
        int resActual = TestConstants.POSITIVE + TestConstants.NEGATIVE;
        assertEquals(resExpected, resActual);
    }

    @Test
    public void shouldReturnCorrectMinusResultOneNegativeNum() {
        int resExpected = calc.calcMinus(TestConstants.POSITIVE, TestConstants.NEGATIVE);
        int resActual = TestConstants.POSITIVE - TestConstants.NEGATIVE;
        assertEquals(resExpected, resActual);
    }

    @Test
    public void shouldReturnCorrectMultiplyResultOneNegativeNum() {
        int resExpected = calc.calcMultiply(TestConstants.POSITIVE, TestConstants.NEGATIVE);
        int resActual = TestConstants.POSITIVE * TestConstants.NEGATIVE;
        assertEquals(resExpected, resActual);
    }

    @Test
    public void shouldReturnCorrectDivideResultOneNegativeNum() {
        int resExpected = calc.calcDivide(TestConstants.POSITIVE, TestConstants.NEGATIVE);
        int resActual = TestConstants.POSITIVE / TestConstants.NEGATIVE;
        assertEquals(resExpected, resActual);
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenSecondArgumentOfDivisionIsZero() {
        assertThrows(IllegalArgumentException.class,
                () -> calc.calcDivide(TestConstants.POSITIVE, TestConstants.ZERO));
    }


}

