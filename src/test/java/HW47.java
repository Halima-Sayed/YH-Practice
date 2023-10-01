public class HW47 {
    //Write a method to return whether given number is prime or not?

    boolean primeOrNot(int a){
        boolean prime=false; //assume
        int count=0; // to count how many times the number is divisible by any other number
        //1 and itself
        //7
        //8 -> the reason in the loop we have i<=a because if the number is greater than the number we are trying to see if
        //it is prime or not just makes no sense
        //1<7
        //7=7
        for (int i = 1; i <=a; i++) {
            // is whatever i<=7
            if (a%i==0)
                count++;
        }
        if (count==2){ //for the number 7 -> 1,7 count is 2 because it is divisible by 2 numbers so is prime
            prime=true;
        }
        return prime;//for the number 4-> 1,2,4 count is 3 because it is divisible by 3 numbers so not prime
    }

    public static void main(String[] args) {
        HW47 obj=new HW47();
        int num=4;
        boolean ans=obj.primeOrNot(num);
        System.out.println(ans);
    }
}
