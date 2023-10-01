public class HW40 {
    public static void main(String[] args) {
        //Create a String and print it in reverse order (Sunday → yadnuS).
        String a="Sunday";
        for (int i = a.length()-1; i>=0; i--) {
            System.out.print(a.charAt(i));
        }
        System.out.println();
        StringBuilder b=new StringBuilder("Sunday");
        System.out.println(b.reverse());
    }
}
