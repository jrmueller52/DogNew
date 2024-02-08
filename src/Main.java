// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//
// ****************************************************************
import java.util.*;


public class Main
{
    public static void main(String[] args)
    {
        Dog dog = new Dog("Spike");
        System.out.println(dog.getName() + " says " + dog.bark());

        Labrador lab = new Labrador("Max", "yellow");
        System.out.println(lab.getName()+" "+lab.bark());//methods in parent class

        Yorkshire york = new Yorkshire("Bella", 5);
        System.out.println(york.getName()+" "+york.bark());//methods in parent class

        york.waddle();
        lab.waddle();//method not in lab class, siblings do not inherit methods from each// other

        Dog[] dogs = new Dog[3];
        dogs[0]= new Dog("Max");
        dogs[1]= new Labrador("Rudy", "black");
        dogs[2]= new Yorkshire("Rusty", 4);

        for(int i = 0; i< dogs.length;i++) {
            System.out.println(dogs[i].bark());
        }
        for(Dog hi : dogs){
            System.out.println(hi.bark());
        }
        ((Labrador)dogs[1]).waddle();//the lab is stored as a dog so it has to be casted to a lab

    ArrayList <Dog> dogs2 = new ArrayList <Dog>();
    dogs2.add(new Dog("Snowy"));
    dogs2.add(new Labrador("Sandy","tan"));
    dogs2.add(new Yorkshire("Sky", 3));

        for(int i = 0; i< dogs2.size();i++) {
            System.out.println(dogs2.get(i).bark());
        }

        for(Dog yes: dogs2){
            System.out.println(yes.bark());
        }



    }

}
