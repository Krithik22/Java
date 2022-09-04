import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // for Loop
        System.out.println("For Loop:");
        for(int i = 1; i <= 5; i++){
            System.out.println(i);
        }

        System.out.println("While Loop:");
        int a = 1;
        while (a <= 10){
            System.out.println(a);
            a++;
        }
        in.close();
    }
}
