package abc.morgan.training;

import abc.morgan.training.entity.Person;

public class DebugMain {
    public static void main(String[] args) {
        Person person = new Person("Abdul", 20);
        person.incrementTheAge("two");

        System.out.println(person);
    }
}
