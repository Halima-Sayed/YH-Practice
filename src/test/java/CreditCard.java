public class CreditCard {
    //Create a class CreditCard and define variable balance and interest. Create an instance method that will calculate interest based on the given balance.
    //Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    //Call the method by creating an object of each of the three classes.
    double balance;
    double interest;

    public CreditCard(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
    }

    void calculateInterest(){
        System.out.println(balance*interest);
    }
}
class visa extends CreditCard{
    public visa(double balance, double interest) {
        super(balance, interest);
    }
}
class AX extends CreditCard{
    public AX(double balance, double interest) {
        super(balance, interest);
    }
}
class CreditCardTester {
    public static void main(String[] args) {

        CreditCard obj = new CreditCard(12.1, 13.1);
        obj.calculateInterest();

        visa v=new visa(22.2,44.4);
        v.calculateInterest();

        AX ax=new AX(43.2,22.2);
        ax.calculateInterest();
    }
}