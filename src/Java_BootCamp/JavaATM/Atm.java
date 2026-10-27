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
        bal=amount+bal;
        System.out.println("Total Amount : "+(bal));
    }
    public void withdraw(double amount){
        if(amount<bal) {
            System.out.println("Withdraw Successfully!");
            System.out.println("Withdraw amount is : " + amount);
            bal=bal - amount;
            System.out.println("Total balance is : " + (bal));
        }else
            System.out.println("Insufficient Balance..!!");
    }
//    public void miniStatement(int choice){
//
//    }
}
