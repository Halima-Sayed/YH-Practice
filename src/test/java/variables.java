public class variables {
    //Create a Java program and name it Variables
    //In your program create different type of variables to store student’s information(name, last name, grade, city, state, phone number) and then print value of those variables in the format:
    //My name is  and my  last name is __
    //I am A/B student
    //I live in city and state__
    //And my phone number is …..
    public static void main(String[] args) {
        String firstName="Hi";
        String lastName="Bye";
        char grade='A';
        String city="Wonderland";
        String state="Neverland";
        int number=123445656;
        System.out.println("My name is "+firstName+" and my last name is "+lastName+"\nI am "+grade+"Student. \nI live in city "+city+" and state "+state+" \nAnd my phone number is "+number);

        //Change student’s city, state, phone number and grade. And print those updated values:
        //Example:
        //My name is  and I moved to new city and new state. My new phone number is

        city="Noland";
        state="Alwaysland";
        number=827262;
        grade='F';
        System.out.println("My name is "+firstName+" and I moved to a new city "+city+" and new state "+state+"My new phone number is "+number);

    }
}
