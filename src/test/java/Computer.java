public class Computer {
    //Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
    //Define common behavior within and some fields in parent class and override some of the methods in child classes
    //Define some methods specific to child classes
    //Create objects of child classes and store them into array. Loop through each object and execute available methods.
void speaker(){
    System.out.println("Speaker plays loud music");
}
void charge(){
    System.out.println("Computer is charging");
}
void on(){
    System.out.println("Turn on computer");
}
void off(){
    System.out.println("Turn off computer");
}
  /* void printComputerName(){
        System.out.println(getClass().getSimpleName()+":");
    }

   */
}
class Apple extends Computer{
@Override
    void speaker(){
  //  printComputerName();
    System.out.println("speaker sucks");
}

    @Override
    void charge() {
        System.out.println("Charge lasts long");
    }
    void screenResolution(){
        System.out.println("Screen reso is the best");
    }




}
class Lenovo extends Computer{

    @Override
    void charge() {
        System.out.println("Battery not good");
    }

    void keyboard(){
        System.out.println("Keyboard is the best");
    }


}
class HP extends Computer{
    @Override
    void on() {
        System.out.println("Turns on fast");
    }

    void camera(){
        System.out.println("Camera not so good");
    }
}
class Dell extends Computer{
    @Override
    void off() {
        System.out.println("Turn off fast");
    }

    void ram(){
        System.out.println("Has a high ram");
    }
}
class computerTester {
    public static void main(String[] args) {
        Computer[] c = {new Apple(), new Lenovo(), new HP(), new Dell()};
        for (Computer computer : c) {
            String className = computer.getClass().getSimpleName().toUpperCase();
            System.out.println(className + ":");
            computer.charge();
            computer.off();
            computer.on();
            computer.speaker();

        /*    Computer abc=new Apple();
            Apple a=(Apple) abc;
            a.screenResolution();

         */

          if (computer instanceof Apple){
                ((Apple)computer).screenResolution();
            }else if (computer instanceof Lenovo) {
                ((Lenovo)computer).keyboard();
            } else if (computer instanceof HP) {
                ((HP)computer).camera();
            } else if (computer instanceof Dell) {
                ((Dell)computer).ram();
            }
        }

        }
    }
