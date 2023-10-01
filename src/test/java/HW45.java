public class HW45 {
    //Create a method that will say Hello in different language based on the country that will passed when method is executed.

        void lang(String a){
            switch (a){
                case "English":
                    System.out.println("Hi");
                    break;
                case "French":
                    System.out.println("Bonjour");
                    break;
                case "Spanish":
                    System.out.println("Hola");
                    break;
                case "Arabic":
                    System.out.println("سلام");
                    break;
            }
        }

    public static void main(String[] args) {
        HW45 a=new HW45();
        a.lang("English");
        a.lang("French");
        a.lang("Spanish");
        a.lang("Arabic");
    }
}
