public class HW56 {
    //Create 1 class with a static method that has 3 overloaded forms. Then call each overloaded method with specific arguments and observe result.

    static void concat(String a, String b){
        System.out.println(a+b);
    }
    static void concat(String a, String b,String c){
        System.out.println(a+b+c);
    }
    static void concat(String a, String b,String c,String d){
        System.out.println(a+b+c+d);
    }

    public static void main(String[] args) {
        concat("Co","ol");
        concat("Int","egr","ate");
        concat("ove","rlo","ad","ed");
    }
}