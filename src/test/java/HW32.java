public class HW32 {
    //Create a 2D array(shorter way) in which first array will consist of 4 names and second array will contain grades. Then your program should print name of the students that has A and B grade
    public static void main(String[] args) {
        String[][] a = {{"What", "Bye", "Hi", "What"},
                {"A", "B", "C", "D"}
        };
        //System.out.println(a[0][0]);
        //System.out.println(a[0][1]);

        for (int i = 0; i < a[0].length; i++) {
            if ("A".equals(a[1][i]) || "B".equals(a[1][i])) {
                System.out.println(a[0][i]);
            }
        }
    }
}