package by.epam.calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAddShouldAddWhenNumbersPositive() {
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.add(1, 2);

        //then
        Assert.assertEquals(3, result);
    }

    @Test
    public void testAddShouldAddWhenNumbersNegative() {
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.add(-1, -2);

        //then
        Assert.assertEquals(-3, result);
    }

    @Test
    public void testAddShouldAddWhenFirstNumbersNegativeAndSecondNumberPositive() {
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.add(-1, 2);

        //then
        Assert.assertEquals(1, result);
    }

    @Test
    public void testDeductShouldDeductWhenNumbersPositive() {
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.deduct(2, 1);

        //then
        Assert.assertEquals(1, result);
    }

    @Test
    public void testDeductShouldDeductWhenNumbersNegative() {
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.deduct(-1, -2);

        //then
        Assert.assertEquals(1, result);
    }

    @Test
    public void testDeductShouldDeductWhenResultShouldNegative() {
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.deduct(1, 2);

        //then
        Assert.assertEquals(-1, result);
    }

    @Test
    public void testMultiplyShouldMultiplyWhenNumbersPositive() {
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.multiply(1, 2);

        //then
        Assert.assertEquals(2, result);
    }

    @Test
    public void testMultiplyShouldMultiplyWhenNumbersNegative() {
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.multiply(-1, -2);

        //then
        Assert.assertEquals(2, result);
    }

    @Test
    public void testMultiplyShouldMultiplyWhenFirstNumberPositiveAndSecondNumberNegative() {
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.multiply(-1, 2);

        //then
        Assert.assertEquals(-2, result);
    }

    @Test
    public void testDivideShouldDivideWhenNumbersPositive() {
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.multiply(2, 1);

        //then
        Assert.assertEquals(2, result);
    }

    @Test
    public void testDivideShouldDivideWhenNumbersNegative() {
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.multiply(-2, -1);

        //then
        Assert.assertEquals(2, result);
    }

    @Test
    public void testDivideShouldDivideWhenFirstNumberPositiveAndSecondNumberNegative() {
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.multiply(-2, 1);

        //then
        Assert.assertEquals(-2, result);
    }
}
