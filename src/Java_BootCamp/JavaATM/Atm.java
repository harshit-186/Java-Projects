package Java_BootCamp.JavaATM;

public class Atm {
   private double bal = 5000.0;
    public double getBal(){
        System.out.println("Balance is : "+bal);
        return bal;
    }
    public void deposit(double amount){
        System.out.println("Deposited Successfully!");
        System.out.println("Deposited "+amount);
        System.out.println("Total Amount : "+(amount+bal));
    }
    public void withdraw(double amount){
        if(bal<amount) {
            System.out.println("Withdraw Successfully!");
            System.out.println("Withdraw amount is : " + amount);
            System.out.println("Total balance is : " + (bal - amount));
        }else
            System.out.println("Insufficient Balance..!!");
    }
}
