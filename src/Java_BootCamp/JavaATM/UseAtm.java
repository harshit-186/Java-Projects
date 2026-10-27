package Java_BootCamp.JavaATM;
import java.util.Scanner;
public class UseAtm {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        int pin = 7890;
        int x = 0;
        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter Correct PIN to Access : ");
            int cpin = sc.nextInt();
            if (pin == cpin) {
//                int [] arr = new int[5];
                Atm a = new Atm();
                do {
                    System.out.println("Choose an Option");
                    System.out.println("1. Check Balance");
                    System.out.println("2. Deposit");
                    System.out.println("3. Withdraw");
                    System.out.println("4. Exit");
                    System.out.println("Select an Option : ");
                    choice = sc.nextInt();
//                    for(int j = 0 ; j <5 ; j++ ) {
//                        if (j == 4) {
//                            for (int k = 0; k < 5; k++) {
//                                arr[k] = arr[j-1];
//                            }
//                        }else {
//                            arr[j]=choice;
//                        }
//                    }
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
//                        case 5 ->{
//                            for(int z:arr){
//                                System.out.println(z);
//                            }
//                        }
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
