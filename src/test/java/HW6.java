public class HW6 {
    //Write a program to check whether number is positive or negative.
    //Write a Java Program to check whether number is Even or Odd
    public static void main(String[] args) {
        int a=12;
        if (a%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

        int b=-1;
        if(b<0){
            System.out.println("Negative");
        }else if(b>0){
            System.out.println("Positive");
        }
    }

}
