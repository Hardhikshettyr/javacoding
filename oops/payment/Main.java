
interface Payment{
    void pay(double amount);
}
class UPIPayment implements Payment{
    @Override
    public void pay(double amount){
        System.out.println("Paid INR "+amount+" Using UPT");
    }
}
class CardPayment implements Payment{
    @Override
    public void pay(double amount){
        System.out.println("Paid INR "+amount+" Using Card");
    }
}
class CashPayment implements Payment{
    @Override
    public void pay(double amount){
        System.out.println("Paid INR "+amount+" Using Cash");
    }
}

public class Main {
    public static void processPayment(Payment payment, double amount) {
        payment.pay(amount);
    }
    public static void main(String[]args){
        processPayment(new UPIPayment(),500);
        processPayment(new CardPayment(),400);
        processPayment(new CashPayment(),300);
    }
}
