package abc.morgan.training;

import abc.morgan.training.entity.Person;
import abc.morgan.training.entity.UsCitizen;

import java.util.ArrayList;
import java.util.List;

public class TrainingAbdul3 {
    public static void main(String[] args) {

        // List, Map , Set
        //List =>
        // I can have multiple items in me.
        // I maintain the order of insertion
        // you have to check each element if you want to find something

        Person abdul = new Person("Abdul",30);
        Person ankur = new Person("Ankur",31);
        Person akash = new Person("Akash",41);

        List<Person> people = new ArrayList<>();
        people.add(abdul); //0
        people.add(ankur); //1
        people.add(akash); //2

        /*people.forEach(person ->{
            person.setAge(person.getAge()+10);
            System.out.println(person);
                });*/


        //0,1,2,3.....
        Person abc = new Person("abc",30);
        Person bcd = new Person("bcd",30);

        List<Person> peopleNew = new ArrayList<>();
        peopleNew.add(abc);
        peopleNew.add(bcd);

        people.addAll(peopleNew);
        System.out.println("========"+people);
        Person toFind = new Person("abc",31);
        System.out.println(abc+" "+toFind);

        System.out.println(people.contains(toFind));
//=========================================================
        List<Integer> superListNumber = new ArrayList<>();
        superListNumber.add(1);
        superListNumber.add(2);
        superListNumber.add(3);
        superListNumber.add(4);

        List<Integer> numbersToFind = new ArrayList<>();
        numbersToFind.add(1);
        numbersToFind.add(4);

        System.out.println(superListNumber.containsAll(numbersToFind));

        //numbersToFind.clear();
        if(numbersToFind.isEmpty()){
            System.out.println("I am empty");
        } else{
            System.out.println("I have something");
        }

        System.out.println(numbersToFind.size());
        System.out.println(numbersToFind.remove((Integer) 4));
        System.out.println(superListNumber.subList(0,2));
//==========================================================================================



        /*UsCitizen citizen = new UsCitizen("Abdul","123");
        UsCitizen citizen1 = new UsCitizen("Abdul","123345");

        System.out.println(citizen.equals(citizen1));

        System.out.println(citizen);
        System.out.println(citizen1);*/







        //boolean bool=false;

        //Boolean condition = (bool == true);

        /*if(bool){
            System.out.println("Its true");
        }else{
            System.out.println("Its False");
        }

        String abc = "human";

        if(abc.equals("human")){
            System.out.println("I am a human");
        }else if(abc.equals("animal")){
            System.out.println("I am an animal");
        }else {
            System.out.println("I am a bird");
        }

        switch (abc){
            case "human":
                System.out.println("Switch statement found me as human");
                break;
            case "animal":
                System.out.println("Switch statement found me as animal");
                break;
            default:
                System.out.println("Switch statement found me as bird");
                break;
        }*/

    }
}
