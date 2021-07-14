package abc.morgan.training;

import abc.morgan.training.entity.Person;
import abc.morgan.training.maths.Calculator;

import java.util.ArrayList;
import java.util.List;

public class ExceptionsDemo {
    //Exception
    public static void main(String[] args) {
        Person person = null;

        /*System.out.println(person.getAge());
        List<String> list = new ArrayList<>();
        System.out.println(list.get(1));*/

        /*
        *  Top in the hierarchy we have class "Throwable"
        *   Then we have class Exception
        *   There are 2 types of Exception
        *   1. Checked Exception
        *   2. Unchecked Exception //Arithmetic Exception, IndexOutOfBoundException & NullPointerException
        *
        *   try .. catch .. finally
        *   throw and Throws
        *   => CustomExceptions
        * */


        /*try {
            System.out.println("I am in try block");
            Class.forName("abc.morgan.training.entity.xyz");
            System.out.println("I am exiting try block");
        } catch (ClassNotFoundException e) {
            System.out.println("I am in catch block");
            e.printStackTrace();
        } finally {
            System.out.println("I am in finally block");
        }

        System.out.println("See I am still executing");*/

        /*Integer value = null;
        try {
            value = 100 / 0;
            System.out.println("close the conn here");
        } catch (Exception ex){
            value = -1;
        } finally {
            System.out.println("Closed the conn");
        }

        System.out.println("The value is "+ value);*/


        try {
            /*System.out.println(person.getAge());
            List<String> list = new ArrayList<>();
            System.out.println(list.get(1));*/

            //throw new NullPointerException();
            Calculator.divide(100,0);
        }
        catch (NullPointerException npe){
            System.out.println("I am a null pointer");
        }
        catch (IndexOutOfBoundsException iobe){
            System.out.println("Index out of Bound");
        }
        catch (Exception ex){
            System.out.println("Some exception");
        }
        finally {
            System.out.println("I am in finally");
        }

        //SomethingWentWrongException

    }

}
