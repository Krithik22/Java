import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Nth term:");
        int n = in.nextInt();
        int a = 0,b = 1;
        int cnt = 2;
        while(cnt<=n){
            int temp = b;
            b = b+a;
            a =  temp;
            // System.out.println(b);
            cnt++;
        }
        System.out.println("The "+n+"th Fibonacci term is " + b);
        in.close();
    }
}