import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Car bmw = new Car();
        // Car ferrari = new Car();
        // Car audi = new Car();
        // Car[] cars = new Car[3];
        // System.out.println(Arrays.toString(cars));

        Student krithik = new Student();
        krithik.greeting();
    }
}

class Student {
    int rno;
    String name;
    float marks;

    Student() {
        this.rno = 47;
        this.name = "Krithik";
        this.marks = 84.9f;
    }

    Student(int _rno, String _name, float _marks) {
        this.rno = _rno;
        this.name = _name;
        this.marks = _marks;
    }

    Student(Student other) {
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }

    void greeting() {
        System.out.println("Hello! my name is " + name);
    }
}

class Car {
    String engine;
    String price;
    int seats;
}