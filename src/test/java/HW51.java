public class HW51 {
    //Write a java Class Students that have a constructor which takes students name and 3 subject grades. Inside your class also have a method to Calculate Average Grade.
    //Test Student class for 5 different students with different marks. Your program should print an average mark of each students name.

    String name;
    int science;
    int it;
    int biology;

    public HW51(String name, int science, int it, int biology){
        this.name=name;
        this.science=science;
        this.it=it;
        this.biology=biology;
    }

    void avgGrade(){
        int avg=(science+it+biology)/3;
        System.out.println(avg);

    }

    public static void main(String[] args) {
        HW51 obj=new HW51("Hi",55,100,99);
        obj.avgGrade();
        HW51 obj1=new HW51("Bye",45,43,77);
        obj1.avgGrade();
        HW51 obj2=new HW51("What",77,63,93);
        obj2.avgGrade();
        HW51 obj3=new HW51("Huh",88,99,65);
        obj3.avgGrade();
        HW51 obj4=new HW51("Hello",99,80,22);
        obj4.avgGrade();

    }
}
