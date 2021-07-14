package abc.morgan.training.maths;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAddFunctionality(){
        //Given
        Integer firstNumber = 5;
        Integer secondNumber = 6;

        // When
        Integer output = Calculator.add(firstNumber,secondNumber);

        //Then
        Assert.assertEquals((Integer) 11, output);
    }

    @Test
    public void testAddFunctionality1(){
        //Given
        Integer firstNumber = -5;
        Integer secondNumber = 6;

        // When
        Integer output = Calculator.add(firstNumber,secondNumber);

        //Then
        Assert.assertEquals((Integer) 1, output);
    }

    @Test
    public void testAddFunctionality2(){
        //Given
        Integer firstNumber = -5;
        Integer secondNumber = -6;

        // When
        Integer output = Calculator.add(firstNumber,secondNumber);

        //Then
        Assert.assertEquals(new Integer(-11), output);
    }
}
