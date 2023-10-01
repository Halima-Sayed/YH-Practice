import java.util.Scanner;

public class HW41 {
    public static void main(String[] args) {
        //Write a program that reads two people's first
        //names and if they expecting boy or girl?
        //Based on the input suggests a name for a baby:
        //Example Output:
        //Mom’s first name? Mary
        //Dad’s first name? Daniel
        //Boy or Girl? boy
        //Suggested baby name: DANRY
        //
        //Example Output:
        //Mom’s first name? Mary
        //Dad’s first name? Daniel
        //Boy or Girl? girl
        //Suggested baby name: MAIEL

        Scanner scan=new Scanner(System.in);
        System.out.println("Write person 1 first name");
        String p1= scan.next();
        System.out.println("Write person 2 first name");
        String p2= scan.next();
        System.out.println("Is the gender boy or girl?");
        String gender= scan.next();

        if(gender.equalsIgnoreCase("boy")){
            System.out.println("Boys name "+p1.substring(0,3)+p2.substring(2,4));
        } else if (gender.equalsIgnoreCase("girl")) {
            System.out.println("Girls name "+p2.substring(0,2)+p1.substring(3,6));
        }
    }
}
