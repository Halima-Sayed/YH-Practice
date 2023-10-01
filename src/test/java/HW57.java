public class HW57 {
    //Create 1 class with a private method that has 3 overloaded forms. Then call each overloaded method with specific arguments and observe result.

    private void add(int a, int b){
        System.out.println(a+b);
    }
    private void add(int a, int b,int c){
        System.out.println(a+b+c);
    }
    private void add(int a, int b,int c, int d){
        System.out.println(a+b+c+d);
    }

    public static void main(String[] args) {
        HW57 obj=new HW57();
        obj.add(2,2);
        obj.add(2,2,1);
        obj.add(2,2,1,1);
    }
}
