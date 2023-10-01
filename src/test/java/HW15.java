import java.util.Scanner;

public class HW15 {
    //Write a program for user to enter his/hers birth month. Based on the month define the season.
    //Example: if user is born in March, April, May → season =”Spring”
    //if user is born in June, July, August →
    //season =”Summer”  etc …
    //At the end of the program we should see 1 output as “You were born is season __”.
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your birthday month");
        String bDayMonth= scanner.next();
        if(bDayMonth.equalsIgnoreCase("March")|| bDayMonth.equalsIgnoreCase("April") || bDayMonth.equalsIgnoreCase("May")){
            System.out.println("You were born is season Spring");
        } else if (bDayMonth.equalsIgnoreCase("June")||bDayMonth.equalsIgnoreCase("July")||bDayMonth.equalsIgnoreCase("August")) {
            System.out.println("You were born is season Summer");
        } else {
            System.out.println("You were born is season Winter");
        }
    }
}
