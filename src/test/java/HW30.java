public class HW30 {
    public static void main(String[] args) {
        //From an array of integer elements find the largest number.
        int[] a={2,2,2,4,1,1};
        int largestNum=a[0];
        for (int i = 0; i <a.length ; i++) {
            if(a[i]>largestNum){
                largestNum=a[i];
            }
        }
        System.out.println(largestNum);
    }
}
