import java.util.Scanner;

public class HW38 {
    public static void main(String[] args) {
        //Store username, password and confirm password from a user and check following requirements:
        //Username and Password cannot be  empty, if so→ message=”Username or Password cannot be empty”.
        //Password should be minimum 8 characters, if less → message=”Password is too short”.
        //Password cannot contain username if so, → message=”Password cannot contain username”.
        //Password should match confirmed password, if not  → message=“Passwords do not match”.
        //Only after all requirements met → message “Your username and password has been created”
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter username");
        String u= scan.next();
        System.out.println("Enter password");
        String p= scan.next();
        System.out.println("Confirm password");
        String cp= scan.next();

        if(u.isEmpty()|| p.isEmpty() ){
            System.out.println("Username or Password cannot be empty");
        }else if (p.length()<8 ){
            System.out.println("Password is too short");
        } else if (p.contains(u)) {
            System.out.println("Password cannot contain username");
        } else if (!p.equals(cp)) {
            System.out.println("Passwords do not match");
        }else{
            System.out.println("Your username and password has been created");
        }

    }
}
