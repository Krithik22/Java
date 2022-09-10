import java.util.*;

public class Countoccurence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Give the number: ");
        int n = in.nextInt();
        System.out.print("Check the occurence of ");
        int check = in.nextInt();
        int cnt = 0;
        while(n > 0){
            int rem = n % 10;
            if(rem == check){
                cnt++;
            }
            n = n/10;
        }
        System.out.println(check + " has occured " + cnt + " times");
        in.close();
    }
}
