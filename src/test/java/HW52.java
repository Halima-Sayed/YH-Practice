public class HW52 {
    //Write a java class that have 4 constructors with 4 different access levels of constructors(private,public,default,protected)
    // and create 4 objects of this class: 1 - inside same class; 2 - from outside the class; 3 - from different class inside different package  and observe result.

    String name;
    String lastName;
    String color;
    double height;

    private HW52(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public HW52(String color) {
        this.color = color;

    }

    protected HW52(double height, String name) {
        this.height = height;
        this.name = name;
        //not done yet
    }

    HW52(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Last Name: " + lastName + ", Color: " + color + ", Height: " + height;
    }

        public static void main (String[]args){
            HW52 privateObj=new HW52("Hi","Bye");
            System.out.println(privateObj.name+" "+privateObj.lastName);
          //HW52 privateObj = new HW52("John", "Doe");
            //System.out.println(privateObj);
        }
    }

