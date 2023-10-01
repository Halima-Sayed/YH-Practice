public class HW46 {
//Create a method createEmail().
// Based on values of users firstName, lastName and email type, your method should return complete email Address.
// Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com

    String createEmail(String a, String b, char c, String d){
        return a+b+c+d;
    }

    public static void main(String[] args) {
        HW46 e=new HW46();
        String fn="John";
        String ln="Snow";
        char idk='@';
        String mail="gmail.com";
        String res=e.createEmail(fn,ln,idk,mail);
        System.out.println(res);
    }
}
