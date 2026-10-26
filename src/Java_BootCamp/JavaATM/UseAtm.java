package Java_BootCamp.JavaATM;
import java.util.Scanner;
public class UseAtm {
    static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            boolean running = true ;
            int bal = 5000;
            int choice = 0;
            Atm a =new Atm();
            do{
                System.out.println("Choose an Option");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Exit");
                System.out.println("Select an Option : ");
                choice = sc.nextInt();
                switch(choice){
                    case 1 :
                        a.getBal();
                        break;
                    case 2 :
                        System.out.println("Enter deposit amount : ");
                        int amount = sc.nextInt();
                        a.deposit(amount);
                        break;
                    case 3 :
                        System.out.println("Enter withdraw amount : ");
                        int k = sc.nextInt();
                        a.deposit(k);
                        break;
                    case 4 :
                        System.out.println("Thank You!");
                        break;
                    default:
                        System.out.println("Try again!!Please Choose correct option.");
                }
            }while(choice!=4);
        }
    }
