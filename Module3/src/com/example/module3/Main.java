package com.example.module3;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your weekly income: ");
        double income = input.nextDouble();
        double taxRate;
        if (income < 500) { // with income less that $500, apply 10%
            taxRate = 0.10;
        } else if (income >= 500 && income < 1500) { // with income between $500 - $1500, apply 15%
            taxRate = 0.15;
        } else if (income >= 1500 && income < 2500) { // with income between $1500 - $1200, apply 20%
            taxRate = 0.20;
        } else {
            taxRate = 0.30; // with income greater than $2500, apply 30%
        }
        double withholding = income * taxRate;
        System.out.printf("Weekly Income:", income);
        System.out.printf("Tax Rate: %.0f%%%n", taxRate * 100);
        System.out.printf("Weekly Tax Withholding: $%.2f%n", withholding);
        input.close();
    }
}
