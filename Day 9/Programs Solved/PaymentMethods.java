interface Payment{
    void pay(double amount);
}
class UPI implements Payment{
    String upiId;
    UPI(double amount, String upiId){
        this.upiId = upiId;
    }
    public void pay(double amount){
        System.out.println("Paying " + amount + " via UPI: " + upiId);
    }
}
class Cash implements Payment{
    public void pay(double amount){
        System.out.println("Paying " + amount + " via cash: ");
    }
}
class CreditCard implements Payment{
    String creditCardNum;
    CreditCard(double amount, String creditCardNum){
        this.creditCardNum = creditCardNum;
    }
      public void pay(double amount){
        System.out.println("Paying " + amount + " via Credit Card: " + creditCardNum);
    }
}
public class PaymentMethods {
    public static void main(String[] args) {
        Payment p1 = new UPI(1000, "256tgf");
        Payment p2 = new Cash();
        Payment p3 = new CreditCard(5000, "1224-5678-9012-3456");

        p1.pay(1600);
        p2.pay(1000);
        p3.pay(54000);
    }
}
