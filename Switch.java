import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch(fruit){
            case "Mango" -> System.out.println("Sweet Summer fruit");
            case "apple" -> System.out.println("It keeps doctors away");
            default -> System.out.println("Enter a valid fruit");
        }

        in.close();
    }
}
