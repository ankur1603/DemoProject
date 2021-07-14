import abc.morgan.training.entity.Person;
import abc.morgan.training.livingbeing.habitat.Room;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo {

    public static void main(String[] args) {
        /*
        * Map => Key/value pair
        * Map can have multiple items in it.
        * Unlike list , we can access the items by the key
        * this is the fastest way of retrieving the item
        * Key/Value => can be any non-primitive/Class
        * The insertion order is not maintained.
        * */

        Map<Person, Room> personRoomMap = new HashMap<>();

        Map<Integer,String> numberMap = new HashMap<>();
        numberMap.put(1,"one");
        numberMap.put(2,"two");
        numberMap.put(3,"three");
        numberMap.put(4,"four");

        System.out.println(numberMap.get(3));
        //=========================================
        Person abdul = new Person("Abdul",34); //ssn1
        Person ankur = new Person("Ankur",35); //ssn2
        Person xyz = new Person("Xyz", 0);

        Map<String,Person> personMap = new HashMap<>();
        personMap.put("ssn1",abdul);
        personMap.put("ssn2",ankur);

        System.out.println(personMap.get("ssn22"));
        System.out.println(personMap.containsKey("ssn2"));
        System.out.println(personMap.containsValue(abdul));
        Person defaultPerson = new Person("Default Person",0);
        System.out.println(personMap.getOrDefault("non_existent_key", defaultPerson));
        System.out.println(personMap.isEmpty());
        //personMap.remove("ssn2");
        System.out.println(personMap);
        System.out.println(personMap.keySet());
        System.out.println(personMap.values());
        System.out.println(personMap.entrySet());

        for(Map.Entry keyValue: personMap.entrySet())
        {
            System.out.println("Key is "+ keyValue.getKey() +" and value is "+ keyValue.getValue());
        }

        System.out.println(personMap.size());

    }
}
