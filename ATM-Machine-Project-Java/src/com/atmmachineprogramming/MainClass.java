package com.atmmachineprogramming;

import java.util.Scanner;

public class MainClass {
	
	public static Scanner input = new Scanner(System.in);
	
    public static void main (String [] args) {
        AtmOperationInterf op = new AtmOperationImpl();
        int atmnumber = 1234;
        int atmpin = 2023;
        
      //  System.out.println(input);
        System.out.println("Welcome to ATM Machine !!!");
        System.out.print("Enter Your Atm Number : ");
        int atmNumber = input.nextInt();
        System.out.print("Enter Your Atm Pin: ");
        int pin = input.nextInt();
        
        if((atmnumber == atmNumber) && (atmpin == pin)) {
            while(true) {
                System.out.println(" 1. View Available Balance\n 2. Withdraw Amount\n 3. Deposit Amount\n 4. View Ministatement\n 5. Exit");
                System.out.println("Enter Choice : ");
                int ch = input.nextInt();
                if(ch == 1) {
                    op.viewBalance();

                }
                else if(ch==2){
                    System.out.println("Enter amount to withdraw ");
                    double withdrawAmount=input.nextDouble();
                    op.withdrawAmount(withdrawAmount);

                }
                else if(ch==3){
                    System.out.println("Enter Amount to Deposit :");
                    double depositAmount=input.nextDouble();//5000
                    op.depositAmount(depositAmount);


                }
                else if(ch==4){
                    op.viewMiniStatement();
                    System.out.print("Please any transaction ..");
                }
                else if(ch==5){
                    System.out.println("Please Collect Your ATM Card\n Thank you for using ATM Machine!!");
                    System.exit(0);
                }
                else
                {
                    System.out.println("Please Enter Correct Choice");
                }
            }
        }
        else{
            System.out.println("Incorrect Your Atm Number or pin");
            System.exit(0);
        }

    }
}
