import java.util.Scanner;

public class Prep6UniqColor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int noOfShirts = in.nextInt();
        int[] shirts = new int[noOfShirts];
        for (int i = 0; i < shirts.length; i++) {
            shirts[i] = in.nextInt();
        }
        int uniqueNoOfShirts = 0;
        for (int i = 0; i < shirts.length; i++) {
            int flag = 0;
            for (int j = i+1; j < shirts.length; j++) {
                if(shirts[i] == shirts[j]){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                uniqueNoOfShirts++;
            }
        }
        System.out.println(uniqueNoOfShirts);
    }
}
