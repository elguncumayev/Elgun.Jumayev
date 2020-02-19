package ZooApp;

public class Cat extends Animal{
    public  Cat(String name){
        this.name = name;
    }
    String name;
    @Override
    public String toString() {
        return String.format("I'm a Cat. My name is %s.",this.name);
    }
}