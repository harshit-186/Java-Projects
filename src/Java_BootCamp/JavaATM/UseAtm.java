package Java_BootCamp.JavaATM;
import java.util.Scanner;
public class UseAtm {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        int bal = 5000;
        int choice = 0;
        int pin = 7890;
        int x = 0;
        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter Correct PIN to Access : ");
            int cpin = sc.nextInt();
            if (pin == cpin) {
                Atm a = new Atm();
                do {
                    System.out.println("Choose an Option");
                    System.out.println("1. Check Balance");
                    System.out.println("2. Deposit");
                    System.out.println("3. Withdraw");
                    System.out.println("4. Exit");
                    System.out.println("Select an Option : ");
                    choice = sc.nextInt();
                    switch (choice) {
                        case 1 -> {
                            a.getBal();
                        }
                        case 2 -> {
                            System.out.println("Enter deposit amount : ");
                            double amount = sc.nextInt();
                            a.deposit(amount);
                        }
                        case 3 -> {
                            System.out.println("Enter withdraw amount : ");
                            double k = sc.nextInt();
                            a.withdraw(k);
                        }
                        case 4 -> {
                            System.out.println("Thank You!");
                        }
                        default -> System.out.println("Try again!!Please Choose correct option.");
                    }
                } while (choice != 4);
            } else {
                System.out.println("You attempted "+(i)+" time Incorrect PIN!");
                System.out.println("Access Denied! Incorrect PIN !!");
                System.out.println(3-i+" Attempts are left !!");
            }
        }
        System.out.println("You Attempted 3 Incorrect PIN..");
        System.out.println("Your Account has locked!! Plz contact to Bank!");
        System.exit(0);
    }
    }
