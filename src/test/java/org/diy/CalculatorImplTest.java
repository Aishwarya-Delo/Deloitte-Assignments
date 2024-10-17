package org.diy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class CalculatorImplTest {

    private CalculatorImpl calcImpl;

    @BeforeEach
    public void setUp(){
        calcImpl = new CalculatorImpl();
    }

    @Test
    void additionShouldReturnValidValue() {
        int a = 5;
        int b = 3;
        int expectedResult = 8;
        int actualResult = calcImpl.addition(a,b);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void subtractionShouldNotReturnNegativeValue() {
        int a = 5;
        int b = 3;
        int actualResult = calcImpl.subtraction(a, b);
        //Assertions.assertTrue(actualResult > 0);
        Assertions.assertFalse(actualResult < 0);
    }

    @Test
    void multiplicationShouldNotEqualsWrongValue() {
        int a = 5;
        int b = 3;
        int wrongValue = 16;
        int actualResult = calcImpl.multiplication(a,b);
        Assertions.assertNotEquals(wrongValue, actualResult);
    }

    @Test
    void divisionShouldFail() {
        int a = 9;
        int b = 3;
        int expectedResult = 2;
        int actualResult = calcImpl.division(a,b);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void divisionShouldThrowExceptionWhenDividedByZero() {
        int a = 5;
        int b = 0;
        Assertions.assertThrows(ArithmeticException.class, () -> {
            calcImpl.division(a, b);
        });
    }

    @Test
    void remainderShouldReturnValidValue() {
        int a = 7;
        int b = 3;
        Integer expectedResult = 1;
        Integer actualResult = calcImpl.remainder(a,b);
        Assertions.assertNotNull(actualResult);
        Assertions.assertEquals(expectedResult, actualResult);
    }

}