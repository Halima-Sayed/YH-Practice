public class HW42 {
    public static void main(String[] args) {
        //Create a String that will hold a sentence. Write a program to get a new String without any spaces.
        //How would you reverse a String word by word? for example
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever

        String sen="This is sentence I want to reverse";
        String[] split=sen.split(" ");
        for (String s : split) {
            reverse(s);
        }
    }
    public static void reverse(String s){
        String rev="";
        for (int i = s.length()-1; i >=0; i--) {
            rev+=s.charAt(i);
        }
        System.out.print(rev+" ");
    }
}
