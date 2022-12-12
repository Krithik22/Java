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
        // int cnt = 0;
        for (int i = 0; i < shirts.length; i++) {
            int flag = 0;
            for (int j = 0; j < shirts.length; j++) {
                if(i == j){
                  continue;
                }
                // System.out.println("not breaking from inner loop" + i + " " + j);
                if(shirts[i] == shirts[j]){
                    flag = 1;
                    // cnt++;
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
