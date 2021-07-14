package abc.morgan.training.maths;

public class Calculator {

    //Operator
    // Mathematical Operators
    // Addition => +
    // Substraction => -
    // Division => /
    //Multiplication => *
    // Modulus => %

    //Logical Operators
    // And => &&
    // Or => ||
     //condition1 is true or condition2 is true
    // condition1==true || condition2==true

    //condition1 is true and condition2 is true
    // condition1==true && condition2==true


    public static Integer add(Integer firstNumber,Integer secondNumber){
        return firstNumber + secondNumber;
    }


    public static Integer divide(Integer firstNumber,Integer secondNumber) throws ArithmeticException {
            throw new ArithmeticException("Division by zero is not allowed");
        //return firstNumber / secondNumber;
    }

}
