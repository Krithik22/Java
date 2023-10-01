import java.util.Scanner;
import Inheritance.Dog;

public class Kiki {
    public static void main(String[] args) {
        B b = new B();
        b.getA();
    }
    static class A{
//        int a;
//        A(int a){
//            this.a = a;
//        }
        void getA(){
            System.out.println("Im from A");
        }
    }
    static class B extends A{
//        int b;
//        B(int a, int b){
//            super(a);
//            this.b = b;
//        }

        void getA(){
            System.out.println("Im from B");
        }
    }
    static class C extends B{
//        int c;
//        C(int a,int b,int c){
//            super(a,b);
//            this.c = c;
//        }
    }

}
