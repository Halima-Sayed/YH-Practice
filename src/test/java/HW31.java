public class HW31 {
    //Create an array to store char values and then print those in reverse order
    public static void main(String[] args) {
        char[] a={'A','B','C','D'};
        for (int i = a.length-1; i>=0; i--) {
            System.out.println(a[i]);
        }
    }
}
