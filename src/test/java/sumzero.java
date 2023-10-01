public class sumzero {
    public static int[] createArraySumToZero(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = -i + (n - 1) / 2;
        }
        return array;
    }

    public static void main(String[] args) {

    }
}
