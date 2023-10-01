public class HW54 {
    //Create 1 class in which create a methods that will calculate the area of Rectangle and the area of a Square Method name must be called calculateArea

    public void calculateArea(int a, int b){
        System.out.println("Rectangle "+a*b);
    }
    public void calculateArea2(int a){
        System.out.println("Square "+a*a);
    }
}
class HW54Tester {
    public static void main(String[] args) {

        HW54 obj = new HW54();
        obj.calculateArea(4,6);
        obj.calculateArea2(2);
    }
}