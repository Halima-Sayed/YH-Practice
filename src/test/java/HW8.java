import java.util.Scanner;

public class HW8 {
    //You are a loan specialist and you need to ask user what is the amount of loan
    //is needed. If loan is less or equal to 200,000 then you would lend the money
    //otherwise you would reject the client.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount of loan");
        double loan= scanner.nextDouble();

        if(loan<=200.000){
            System.out.println("Loan approved");
        }else{
            System.out.println("Rejected");
        }

    }
}