package by.epam.calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAddShouldAddWhenNumbersPositive() {
        Calculator calculator = new Calculator();

        int result = calculator.add(1, 2);

        Assert.assertEquals(3, result);
    }

    @Test
    public void testAddShouldAddWhenNumbersNegative() {
        Calculator calculator = new Calculator();

        int result = calculator.add(-1, -2);

        Assert.assertEquals(-3, result);
    }

    @Test
    public void testAddShouldAddWhenFirstNumbersNegativeAndSecondNumberPositive() {
        Calculator calculator = new Calculator();

        int result = calculator.add(-1, 2);

        Assert.assertEquals(1, result);
    }

    @Test
    public void testDeductShouldDeductWhenNumbersPositive() {
        Calculator calculator = new Calculator();

        int result = calculator.deduct(2, 1);

        Assert.assertEquals(1, result);
    }

    @Test
    public void testDeductShouldDeductWhenNumbersNegative() {
        Calculator calculator = new Calculator();

        int result = calculator.deduct(-1, -2);

        Assert.assertEquals(1, result);
    }

    @Test
    public void testDeductShouldDeductWhenResultShouldNegative() {
        Calculator calculator = new Calculator();

        int result = calculator.deduct(1, 2);

        Assert.assertEquals(-1, result);
    }

    @Test
    public void testMultiplyShouldMultiplyWhenNumbersPositive() {
        Calculator calculator = new Calculator();

        int result = calculator.multiply(1, 2);

        Assert.assertEquals(2, result);
    }

    @Test
    public void testMultiplyShouldMultiplyWhenNumbersNegative() {
        Calculator calculator = new Calculator();

        int result = calculator.multiply(-1, -2);

        Assert.assertEquals(2, result);
    }

    @Test
    public void testMultiplyShouldMultiplyWhenFirstNumberPositiveAndSecondNumberNegative() {
        Calculator calculator = new Calculator();

        int result = calculator.multiply(-1, 2);

        Assert.assertEquals(-2, result);
    }

    @Test
    public void testDivideShouldDivideWhenNumbersPositive() {
        Calculator calculator = new Calculator();

        int result = calculator.multiply(2, 1);

        Assert.assertEquals(2, result);
    }

    @Test
    public void testDivideShouldDivideWhenNumbersNegative() {
        Calculator calculator = new Calculator();

        int result = calculator.multiply(-2, -1);

        Assert.assertEquals(2, result);
    }

    @Test
    public void testDivideShouldDivideWhenFirstNumberPositiveAndSecondNumberNegative() {
        Calculator calculator = new Calculator();

        int result = calculator.multiply(-2, 1);

        Assert.assertEquals(-2, result);
    }
}
