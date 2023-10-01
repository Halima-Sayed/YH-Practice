public class HW23 {
    //Create an array of chars and store grades into it: A,B,C,D. Then print a grade B (use 2 different ways of creating an array).
    public static void main(String[] args) {
        char[] grade={'A','B','C','D'};

        char[] grade1=new char[4];
        grade1[0]='A';
        grade1[1]='B';
        grade1[2]='C';
        grade1[3]='D';
        System.out.println(grade[1]);
        System.out.println(grade1[1]);
    }
}
