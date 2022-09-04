import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Salary: ");
        int sal = input.nextInt();
        if(sal > 10000){
            sal += 1000;
        } else if(sal > 15000){
            sal += 2000;
        } else{
            sal += 500;
        }
        System.out.println("Your salary after increment: " + sal);
        input.close();
    }
}
