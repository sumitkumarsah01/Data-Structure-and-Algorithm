import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your First Number = ");
        int a=sc.nextInt();
        System.out.print("Enter your Second Number = ");
        int b=sc.nextInt();
        System.out.print("Enter the operator = ");
        char operation=sc.next().charAt(0);

        switch (operation) {
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            case '%':
                System.out.println(a%b);
            default:
                break;
        }
    } 
}
