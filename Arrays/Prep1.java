import java.util.Scanner;

public class Prep1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int noOfArr = in.nextInt();
        for(int i=0;i<noOfArr;i++){
            int len=in.nextInt();
            int[] arr = new int[len];
            for(int j=0;j<len;j++){
                arr[j]=in.nextInt();
            }
            int max=arr[0],min=arr[0];
            for(int j=0;j<len;j++){
                if(arr[j]>max){
                    max=arr[j];
                }
                if(arr[j]<min){
                    min=arr[j];
                }
            }
            System.out.println(max+" "+min);
        }
    }
}
