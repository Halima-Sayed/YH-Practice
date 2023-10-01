public class HW39 {
    public static void main(String[] args) {
        //Create a String and if the String is not empty perform the following:
        //if the String has an odd number of characters and has 3 or more characters, print the character in the middle of the String.
        //For Example String str=hello =>l

        String a="ABCDEFG";

        if (!a.isBlank() && a.length()>=3 && a.length()%2==1){
           int middleLetter=a.length()/2;
           char midChar=(a.charAt(middleLetter));
            System.out.println(midChar);
        }

    }
}
