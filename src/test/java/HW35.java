public class HW35 {
    public static void main(String[] args) {
        //Create a 2D array or integer type and store numbers in 3 rows and 3 columns. Print the sum of all numbers.
        int[][] a={{2,2,2},
                {3,3,3},
                {4,4,4}};

        int sum=0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sum+=a[i][j];
            }
        }
        System.out.println(sum);
    }
}
