package abc.morgan.training.entity;

import java.util.Objects;

public class Person {
    private String name;
    private Integer age;

    public static String staticMethod(){
        return "I am a static method";
    }

    public Person(){

    }

    public Person(String name){
        this.name = name;
        this.age = 18;
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
//======================

    //accessModifier returnDataType methodName(<parameterType parameter,....>){}

    public Integer incrementTheAge(Integer years){
        return age+years;
    }

    public Integer incrementTheAge(String years){
        if(years.equals("one")){
            return age+1;
        }else if(years.equals("two")){
            return age+2;
        } else{
            return age+3;
        }
    }

    public String getName() {
        return name;
    }

    public String greetWithName(String language){
        return "Hello! My name is "+ name +". I speak "+ language;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

   @Override
   public String toString(){
      return "My name is "+ name + ", age is "+ age;
   }

    @Override
    public boolean equals(Object obj) {
        Person person = (Person) obj;
        return name.equals(person.name) && age.equals(person.age);
    }
}

