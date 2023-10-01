public class HW48 {
    //Create  class Student that will have a method getGrade. Your method should accept the score of a student and return a grade:
    //score > 90 - A
    //score >80 - B
    //score >70 - C
    //score > 50 - D
    //anything else - F

    int getGrade(int a) {
        if (a >= 90) {
            return 'A';
        } else if (a >= 80) {
            return 'B';
        } else if (a >= 70) {
            return 'C';
        } else if (a >= 50) {
            return 'D';
        } else {
            return 'F';
        }
    }
//I can also make the variable char so there will be no need for line number 27
    public static void main(String[] args) {
        HW48 obj=new HW48();
        int grade=55;
        char result=(char)obj.getGrade(grade);
        System.out.println(result);
    }
}
