package com.example.java;

import com.example.java.ClientsList;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ClientsList myClientsList = new ClientsList();

        System.out.println("Enter your id: ");
        Scanner input = new Scanner(System.in);
        int idInt = input.nextInt();

        boolean clientFound = myClientsList.isFound(idInt);

        System.out.println("Enter your Password: ");
        Scanner inputPwd = new Scanner(System.in);
        int idIntPwd = inputPwd.nextInt();

        boolean pwdSecurity = myClientsList.pwdSecurity(idIntPwd);

        System.out.println("MENU \n" +
                "TO CHECK BALANCE TAP: 1 \n" +
                "TO WITHDRAW TAP: 2 \n" +
                "TO DEPOSIT TAP: 3 \n" +
                "EXIT TAP: 4");

        Scanner clientOption = new Scanner(System.in);
        int clientOperation = clientOption.nextInt();

        switch (clientOperation) {
            case 1:
                System.out.println("The balance of your account is: ");

            case 2:
                System.out.println("Enter the amount to withdrew: ");
                Scanner inputWD = new Scanner(System.in);
                double doubleWD = inputWD.nextDouble();

                double wdOperation = myClientsList.withdrew(idInt, doubleWD);

            case 3:
                System.out.println("Enter the amount to deposit: ");
                Scanner inputDeposit = new Scanner(System.in);
                double doubleDeposit = inputDeposit.nextDouble();

                double dpOperation = myClientsList.withdrew(idInt, doubleDeposit);
                System.out.println(dpOperation);
        }

    }
}
