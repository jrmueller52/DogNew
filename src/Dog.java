// ****************************************************************
// Dog.java
//
// A class that holds a dog's name and can make it speak.
//
// ****************************************************************
public class Dog extends Animal
{
    protected String name;

    // ------------------------------------------------------------
    // Constructor -- store name
    // ------------------------------------------------------------
    public Dog(String name)
    {
        super();
        this.name = name;
    }

public void eat(){
    System.out.println("Dog is eating");
}
    // ------------------------------------------------------------
    // Returns the dog's name
    // ------------------------------------------------------------
    public String getName()
    {
        return name;
    }

    // ------------------------------------------------------------
    // Returns a string with the dog's comments
    // ------------------------------------------------------------
    public String bark()
    {
        return "Dog barking";
    }



}
