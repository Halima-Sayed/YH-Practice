public class HW50 {
    //Create a Class called Students
    //Create three  variables  Name , ID  and  numberOfStudents
    //Create three objects of the Students Class
    //Set the value for  studentName , studentID and increment  the numberOfStudents for each object
    //Print out  total number of students

    String name;
    int id;
    static int numberOfStudents;

    public static void main(String[] args) {
       HW50 obj1=new HW50();
       obj1.name="Hi";
       obj1.id=123;
       numberOfStudents++;

       HW50 obj2=new HW50();
        obj2.name="Bye";
        obj2.id=1234;
        numberOfStudents++;


       HW50 obj3=new HW50();
        obj3.name="Huh";
        obj3.id=12345;
        numberOfStudents++;

        System.out.println("The total number of students is "+numberOfStudents);
    }
}
