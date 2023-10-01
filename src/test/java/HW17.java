import java.util.Scanner;

public class HW17 {
    // Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/). Based on operator provide the result to user.

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");
        int a= scanner.nextInt();
        System.out.println("Enter another number");
        int b= scanner.nextInt();
        System.out.println("Enter any calculator operator e.g. (+,*,/,-)");
        char c=scanner.next().charAt(0);

        int result=0;
         switch (c){
             case '+':
                 result=a+b;
                 break;
             case '*':
                 result=a*b;
                 break;
             case '/':
                 result=a/b;
                 break;
             case '-':
                 result=a-b;
                 break;
             default:
                 System.out.println("invalid operator");
                 break;
         }
        System.out.println(result);
    }
}
