package com.company;
import java.util.*;

class ATM_Machine{
    public double AccNo;
    public String name;
}
class Account extends ATM_Machine{
    public int AccBal = 5000;
    public int fine = 200;

}
public class ATM {
    public static void main(String[] args) {

        Account ac = new Account();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Account Number:");
        double Account = sc.nextDouble();
        System.out.println("Enter your name");
        String name = sc.next();

        char choice;
        do {
            System.out.println("Facilities available\n1.Check Balance\n2.Deposit\n3.Withdraw");
            int facility = sc.nextInt();

            if (facility == 1) {
                System.out.println("Your balance is: " + ac.AccBal);
            }
            if (facility == 2) {
                System.out.println("Enter amount to deposit: ");
                int dep = sc.nextInt();
                ac.AccBal = ac.AccBal + dep;
                System.out.println("Updated Balance = " + ac.AccBal);
            }
            if (facility == 3) {
                System.out.println("Enter amount to withdraw: ");
                int with = sc.nextInt();
                if (with>ac.AccBal){
                    System.out.println("Insufficient Balance!");
                    return;
                }
                ac.AccBal = ac.AccBal - with;
                if (ac.AccBal < 5000) {
                    ac.AccBal = ac.AccBal - 200;
                    System.out.println("Low Balance Charges Rs.200 is deducted");
                    System.out.println(" Now,Balance is = " + ac.AccBal);
                }
            }
            System.out.println("Do you want to continue: Y/N");
            choice = sc.next().charAt(0);
        }
        while (choice == 'Y' || choice == 'N') ;
    }
}