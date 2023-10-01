import java.util.Scanner;

public class HW16 {
    //Write a program that will read three inputs of scores (quiz, mid term, and final scores) and determine the grade based on the following rules:
    //if the average score >=90 → grade=A
    //if the average score >= 70 and <90 → grade=B
    //if the average score>=50 and <70 → grade=C
    //if the average score<50 → grade=F
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter quiz score");
        int quiz= scanner.nextInt();

        System.out.println("Enter mid term score");
        int midTerm= scanner.nextInt();

        System.out.println("Enter Final score");
        int finalScore=scanner.nextInt();

        int avr=(quiz+midTerm+finalScore)/3;

        String grade;
        if(avr>=90){
            grade="A";
        } else if (avr>=70 && avr<90) {
            grade="B";
        } else if (avr>=50 && avr<70) {
            grade="C";
        }else if (avr<50){
            grade="F";
        }else {
            grade="Invalid num";
        }
        System.out.println(grade);
    }
}
