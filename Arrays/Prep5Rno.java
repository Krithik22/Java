import java.util.Scanner;

public class Prep5Rno {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        for (int i = 0; i < cases; i++) {
            int noOfStudents = in.nextInt();
            int[] rnos = new int[noOfStudents];
            for (int j = 0; j < rnos.length; j++) {
                rnos[j] = in.nextInt();
            }
            for(int rno = 0; rno < rnos.length; rno+=2){
                System.out.print(rnos[rno]+" ");
            }
            System.out.println();
        }
    }
}
