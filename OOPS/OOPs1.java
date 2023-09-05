public class OOPs1 {
    public static void main(String[] args) {
        // final is like const in JS
        // It used to make constant values;
        final int num = 10;

        // final gives immutability only for primitives
        // for others it refers to the same object but it can change the value of it
        // you cannot reassign it
        final int[] nums = { 1, 2, 3, 4, 5 };
        nums[0] = 3;

        // The Java runtime environment deletes objects when it determines that
        // they are no longer being used. This process is known as garbage collection.
        Student krithik;
        for (int i = 0; i < 1000000000; i++) {
            krithik = new Student(47, "Krithik", "Sai Prasad", 84.5f);
        }

    }
}

class Student {
    int rno;
    String fname;
    String lname;
    float marks;

    // Constructor
    // this keyword - this is used refer to the current object
    // default constructor - If you haven't defined any constructor java makes a
    // default constructor
    // this is a default constructor made by me
    Student() {
        this.rno = 0;
        this.fname = "first name";
        this.lname = "last name";
        this.marks = 0.0f;
    }

    // Parmeterized constructor
    Student(int rno, String fname, String lname, float marks) {
        this.rno = rno;
        this.fname = fname;
        this.lname = lname;
        this.marks = marks;
    }

    // Copy constructor - If the parameter passed to a constructor is another object
    // of the same class
    // then copy all that values to it
    Student(Student otherStudent) {
        this.rno = otherStudent.rno;
        this.fname = otherStudent.fname;
        this.lname = otherStudent.lname;
        this.marks = otherStudent.marks;
    }

    // finalize is similar to destructor in c++
    // This method is done when the java compiler wants to delete a object of this
    // class
    // When the garbage collector is about to collect the object of this class. This
    // method performs its actions
    protected void finalize() {
        System.out.println("Object is destroyed");
        System.out.println(this.fname + " object destroyed");
    }
}