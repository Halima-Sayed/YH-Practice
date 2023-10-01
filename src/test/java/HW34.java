public class HW34 {
    public static void main(String[] args) {
        //Using 2D array create a grocery list.
        //Inside you should have an array of veggies, fruits, dairy and sweets. Retrieve all values from that array using 2 different loops
        String[][] grocery={{"Cucumber","Carrots","Lettuce"},
                {"Mango","Kiwi","Banana","BlueBerries"},
                {"Cake","Chocolate","Honey"},
                {"Milk","Yogurt","Cheese"}};
        for (int i = 0; i < grocery.length; i++) {
            for (int j = 0; j < grocery[i].length; j++) {
                System.out.print(grocery[i][j]+" ");
            }
        }
        System.out.println();
        for (String[] strings : grocery) {
            for (String string : strings) {
                System.out.print(string+" ");
            }
        }
    }
}
