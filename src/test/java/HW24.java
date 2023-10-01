public class HW24 {
    //Create an array of names and store all names of your group. Then print your name from that array. (use 2 different ways of creating an array).
    public static void main(String[] args) {

        String[] names={"HI","Bye","What","Whatever","Halima"};

        System.out.println(names[4]);


        String[] names2=new String[5];
        names2[0]="Hi";
        names2[1]="Bye";
        names2[2]="What";
        names2[3]="Whatever";
        names2[4]="Halima";
        System.out.println(names2[4]);
    }
}
