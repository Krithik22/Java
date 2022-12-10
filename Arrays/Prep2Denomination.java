import java.util.Scanner;

public class Prep2Denomination {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] denomination = {1,2,5,10,20,50,100,500,1000};
        int test = in.nextInt();
        for(int i=0;i<test;i++){
            int change = in.nextInt();
            int cnt = 0;
            int index=denomination.length - 1;
            while(change!=0){
                if(denomination[index]<=change){
                    change -= denomination[index];
                    cnt++;
                } else{
                    index--;
                }
            }
            System.out.println(cnt);
        }
    }
}
