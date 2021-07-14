import abc.morgan.training.entity.Employee;
import abc.morgan.training.entity.Person;
import abc.morgan.training.maths.Calculator;

public class TrainingAbdul {

    public static void main(String[] args){

/*
        Datatypes => primitive and non-primitive
        Primitive -> int ...-2,-1,0,1,2,3...
                     double -> -1.11, 0.01,1.123
*/

        //Integer firstNumber = 1;
        //Integer secondNumber =2;
        Calculator cal = new Calculator();
        cal.add(1,2);


        //Calculator.add(1,2);

        System.out.println(Person.staticMethod());

        Person abdul = new Person("Abdul",30);
        Person ankur = new Person("Ankur");

        Employee abdulEmp = new Employee("Abdul",123);
        Employee ankurEmp = new Employee("Ankur",30,321);

        System.out.println(abdul.getName()+"-"+abdul.getAge());
        System.out.println(abdul.greetWithName("English"));

        System.out.println(ankur.getName()+"-"+ankur.getAge());

        System.out.println(abdulEmp.getName()+"-"+abdulEmp.getAge()+"-"+abdulEmp.getEmpId());
        System.out.println(ankurEmp.getName()+"-"+ankurEmp.getAge()+"-"+ankurEmp.getEmpId());

        Person defaultPerson = new Person();
        System.out.println(defaultPerson.getName()+"-"+defaultPerson.getAge());
        defaultPerson.setAge(22);
        defaultPerson.setName("Alex");
        System.out.println(defaultPerson.getName()+"-"+defaultPerson.getAge());

        System.out.println(defaultPerson.greetWithName("Spanish"));



        Employee defaultEmployee = new Employee();
        System.out.println(defaultEmployee.getName()+"-"+defaultEmployee.getAge()+"-"+defaultEmployee.getEmpId());

        System.out.println(ankur.greetWithName("Spanish"));
        System.out.println(ankurEmp.greetWithName("Scala"));

    }

    public void someTest(){

    }

}
