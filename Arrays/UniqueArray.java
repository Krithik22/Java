// Reffered the solutions.
import java.util.Arrays;
import java.util.Scanner;

public class UniqueArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int[] arr = new int[length];
        int[] visited = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = in.nextInt();
            visited[i] = 0;
        }
        int maxCnt = 0;
        for (int i = 0; i < length; i++) {
            int cnt = 0;
            int current = arr[i];
            while(visited[current] == 0){
                visited[current] = 1;
                cnt++;
                current = arr[current];
            }
            if(cnt > maxCnt){
                maxCnt = cnt;
            }
        }
        System.out.println(maxCnt);
    }
}
