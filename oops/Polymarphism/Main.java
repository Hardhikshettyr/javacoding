package oops.Polymarphism;

class Animal{
    void sound(){
        System.out.println("Animal sound");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Barks");
    }
}

class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("Meows");
    }
}

public class Main {
    public static void main(String[]args){
        Animal[] animals={
            new Dog(),
            new Cat()
        };

        for(Animal animal:animals){
            animal.sound();
        }
    }
}

