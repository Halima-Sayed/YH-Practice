public class Teacher {
    //Write a Java program called Teacher.  Identify features and 4 behaviour of that Class.
    //Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher . Test all 4 classes

    String name;
    String qualification;
    char gender;

    void introduction(){
        System.out.println("My name is "+name+" my qualification is "+qualification+" and my gendr is "+gender);
    }

    void isTeaching(){
        System.out.println("The teacher is teaching");
    }

    void givingTask(){
        System.out.println("This teacher likes giving tasks");
    }

    void talking(){
        System.out.println("Teacher is talking to students");
    }

    void yelling(){
        System.out.println("Teacher is yelling at students now");
    }
}
class mathTeacher extends Teacher{

}
class chemistryTeacher extends Teacher{

}
class pianoTeacher extends Teacher{

}
class teacherTester{
    public static void main(String[] args) {
        mathTeacher mt=new mathTeacher();
        mt.name="Hi";
        mt.qualification="Phd";
        mt.gender='F';
        mt.introduction();
        mt.isTeaching();
        mt.givingTask();
        mt.talking();
        mt.yelling();

        System.out.println("--------------------");
        chemistryTeacher ct=new chemistryTeacher();
        ct.name="Bye";
        ct.qualification="Diploma";
        ct.gender='M';
        ct.introduction();
        ct.isTeaching();
        ct.givingTask();
        ct.talking();
        ct.yelling();

        System.out.println("--------------------");
        pianoTeacher pt=new pianoTeacher();
        pt.name="Huh";
        pt.qualification="HighSchool";
        pt.gender='M';
        pt.introduction();
        pt.isTeaching();
        pt.givingTask();
        pt.talking();
        pt.yelling();
    }
}