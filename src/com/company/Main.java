package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double sales;
        double totalSales;
        int days;
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");

        Scanner input = new Scanner(System.in);
        totalSales= 0.0;

        System.out.println( " How many days you have sales: ");
        days = input.nextInt();

        for( int count = 1; count <= days; count++)
        {

            System.out.println("sales for  " + count + " is" + ": ");
            sales = input.nextDouble();
            totalSales += sales;

        }
        System.out.println( "Total Sales for all days are: " + decimalFormat.format(totalSales));
    }
}
