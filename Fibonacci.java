import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Nth term:");
        int n = in.nextInt();
        int a = 0,b = 1;
        int c = 0;
        for(int i=2;i<=n;i++){
            c = a+b;
            if(i!=n){
                a = b;
                b = c;
            }
        }
        System.out.println("The Nth Fibonacci term is " + c);
        in.close();
    }
}