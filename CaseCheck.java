import java.util.Scanner;
public class CaseCheck{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // next()-inputs the next line
        // trim()-removes all the empty spaces
        // charAt()-gets the char at the given index
        char ch = in.next().trim().charAt(0);
        if(ch >= 'a' && ch <= 'z'){
            System.out.println("Lowercase");
        } else{
            System.out.println("Uppercase");
        }
        in.close();
    }
}