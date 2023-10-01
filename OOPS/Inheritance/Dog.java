package Inheritance;

public class Dog extends Animal {
    Dog(int l) {
        super(l);
    }

    void bark() {
        System.out.println("I'm barking from dog class");
    }

    public static void main(String[] args) {
        Animal a = new Animal(1);
        a.eat();
    }
}
