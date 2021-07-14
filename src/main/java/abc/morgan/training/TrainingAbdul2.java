package abc.morgan.training;

import abc.morgan.training.entity.Vehicle;
import abc.morgan.training.livingbeing.Animal;
import abc.morgan.training.livingbeing.Bird;
import abc.morgan.training.livingbeing.HumanBeing;
import abc.morgan.training.livingbeing.LivingBeing;
import abc.morgan.training.livingbeing.habitat.Nest;
import abc.morgan.training.livingbeing.habitat.Room;

import java.util.Arrays;

public class TrainingAbdul2 {
    public static void main(String[] args) {
        LivingBeing human = new HumanBeing();
        Bird bird = new Bird();
        LivingBeing animal = new Animal();

        Vehicle vehicle = new Vehicle();
        //Room room1 = new Room(vehicle); //Wont Compile
        Room room2 = new Room(bird);

        Nest nest = new Nest(bird);


        System.out.println(human.walk());
        System.out.println(bird.walk());
        System.out.println(animal.walk());

        String abc = "abc";
        abc="bcd";

        final String name = "Abdul";
        //name = "Ankur";
        System.out.println(LivingBeing.bloodColor);
    }
}
