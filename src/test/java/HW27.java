public class HW27 {
    public static void main(String[] args) {
        //Create an array of cars and store 6 elements into it. Using 2 different loops print all values from the array.
        String[] cars={"Wheel","Door","Window","Engine","Headlights","Mirror"};
        for (int i = 0; i < cars.length; i++) {
            System.out.print(cars[i]+" ");
        }
        for (String car : cars) {
            System.out.print(car+" ");
        }
    }
}
