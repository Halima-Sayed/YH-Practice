public class HW49 {
    //Create a Class called SyntaxEmployee:
    //Create three  variables  empID , salary and set the CEO to “Sumair”
    //Create two objects of the class SyntaxEmployee
    //Set the value of eID, salary for each of the objects
    //Print out the eID , salary and  CEO for each of the objects


    int empId;
    double salary;
    String ceo="Yousef";

    public static void main(String[] args) {
        HW49 obj1=new HW49();
        int a=obj1.empId=123456;
        double b=obj1.salary=120.000;
        System.out.println("Employee 1 "+a+" "+b+" "+obj1.ceo);

        HW49 obj2=new HW49();
        int c=obj2.empId=234712;
        double d=obj2.salary=55.000;
        System.out.println("Employee 2 "+c+" "+d+" "+obj2.ceo);

    }
}
