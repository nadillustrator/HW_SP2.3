package pro.sky.java.course2.calculator.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.java.course2.calculator.constants.TestConstants;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class CalcServiceImplParamTest {

    private final CalcServiceImpl calc = new CalcServiceImpl();

    @ParameterizedTest
    @MethodSource("provideCalculatorParams")
    public void shouldSumCorrect(int a, int b) {
        int res = calc.calcPlus(a, b);
        assertEquals(a + b, res);
    }

    @ParameterizedTest
    @MethodSource("provideCalculatorParams")
    public void shouldMinusCorrect(int a, int b) {
        int res = calc.calcMinus(a, b);
        assertEquals(a - b, res);
    }

    @ParameterizedTest
    @MethodSource("provideCalculatorParams")
    public void shouldMultiplyCorrect(int a, int b) {
        int res = calc.calcMultiply(a, b);
        assertEquals(a * b, res);
    }

    @ParameterizedTest
    @MethodSource("provideCalculatorParams")
    public void shouldDivideCorrect(int a, int b) {
        int res = calc.calcDivide(a, b);
        assertEquals(a / b, res);
    }


    private static Stream<Arguments> provideCalculatorParams() {
        return Stream.of(
                Arguments.of(TestConstants.POSITIVE, TestConstants.POSITIVE),
                Arguments.of(TestConstants.POSITIVE, TestConstants.NEGATIVE),
                Arguments.of(TestConstants.ZERO, TestConstants.NEGATIVE),
                Arguments.of(TestConstants.NEGATIVE, TestConstants.NEGATIVE)
        );
    }
}
