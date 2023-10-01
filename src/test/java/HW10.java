import java.util.Scanner;

public class HW10 {
    //Create a Java program that will ask user to input city and temperature.
    //Your program should convert Fahrenheit into Celsius and print “The temperature is
    //the city  is ”
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Which city do you live in");
        String city= scanner.next();

        System.out.println("What is the temp in F");
        double temp= scanner.nextDouble();

        double cel=(temp -32)*5/9;

        System.out.println("The temp in city "+city+" is "+cel+" celsius");
    }
}
