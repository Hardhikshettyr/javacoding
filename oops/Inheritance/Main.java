class Animal{
    void sound(){
        System.out.println("Eating");
    }
}

class Dog extends Animal{
    void sound(){
        super.sound();
        System.out.println("hello");
    }
}
public class Main {
    public static void main(String[]args){
        Dog dog=new Dog();

        dog.sound();
    }
}
