import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = 0;
        while(n>0){
            int rem = n % 10;
            result = (result*10) + rem;
            n /= 10;
        }
        System.out.println("The reversed number is " + result);
        in.close();
    }
}
