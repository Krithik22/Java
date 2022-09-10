import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true){
            int ans = 0;
            System.out.print("Enter the operator: ");
            char op = in.next().trim().charAt(0);
            if(op=='+'|| op=='-'||op=='*'||op=='/'||op=='%'){
                System.out.print("Enter Two Numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                if(op == '+'){
                    ans = num1+num2;
                }else if(op == '-'){
                    ans = num1-num2;
                }else if(op == '*'){
                    ans = num1*num2;
                }else if(op == '/'){
                    if(num2!=0){
                        ans = num1/num2;
                    }
                }else if(op == '%'){
                    ans = num1%num2;
                }
            }else if(op=='X'||op=='x'){
                break;
            }else{
                System.out.println("invalid Operator!!");
            }
            System.out.println(ans);
        }
        in.close();
    }
}
