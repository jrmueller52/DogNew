public abstract class Animal {//had to add eat method to dog class
    private int age;
    public Animal(){
        age = 0;
    }

    public void setAge(int input){
        age = input;
    }

    public int getAge(){
        return age;
    }

    public abstract void eat();

}
