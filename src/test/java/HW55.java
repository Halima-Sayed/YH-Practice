public class HW55 {
    //Create a class named 'Programming'.
    // While creating an object of the class, if nothing is passed to it, then the message "I love programming languages" should be printed.
    // If some String is passed to it, then in place  of "programming languages" the value variable should be printed. Example, if we pass "Java", then "I love Java" should be printed.

    HW55(){
        System.out.println("I love programming languages");
    }
    HW55(String a ){
        System.out.println("I love "+a);
    }
}
class HW55Tester{
    public static void main(String[] args) {
        HW55 obj=new HW55();
        HW55 obj2=new HW55("WASTING TIME BECAUSE I am Yousef and I am LAZY");
    }
}