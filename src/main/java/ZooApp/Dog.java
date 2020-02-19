package ZooApp;

public class Dog extends Animal{
    public Dog(String name){
        this.name = name;
    }
    String name;
    @Override
    public String toString() {
        return String.format("I'm a Dog. My name is %s.",this.name);
    }
}