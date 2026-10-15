package oops.Inheritance.Overriding;

class Animal{
    void sound(){
        System.out.println("Animal makes sounds");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Barks");
    }
}
public class Main {
    public static void main(String[] args) {
        Animal dog=new Dog();
        dog.sound();
    }
}
