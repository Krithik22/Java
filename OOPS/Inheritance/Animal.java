package Inheritance;

public class Animal {
    int legs;

    Animal(int l) {
        this.legs = l;
    }

    void bark(){
        System.out.println("I'm barking from animal class");
    }
    void eat() {
        System.out.println("I'm eating");
    }
}
