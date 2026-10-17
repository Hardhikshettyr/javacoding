class BankAccount{
    private String accountHolder;
    private String accountNumber;
    private double balance;

    public BankAccount(String accountHolder, String accountNumber, double balance){
        this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println(amount+ " deposited Successfully");
        }else{
            System.out.println("Enter valid amount");
        }
    }

    public void withdraw(double amount){
        if(amount>0 && balance >= amount){
            balance-=amount;
            System.out.println(amount+" Withdrawn Successfully");
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }

    public double getbalance(){

        
        return balance;
    }
}





public class Main{
    public static void main(String[]args){
        BankAccount account1= new BankAccount("Hardhik", "ACC101", 5000);
        account1.deposit(1000);
        account1.withdraw(2000);
        System.out.println("Your balance is "+account1.getbalance());
    
    }
}