
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Rudy Arango
 */
package base;
/*
Exercise 10 - Self-Checkout
Working with multiple inputs and currency can introduce some tricky precision issues.

Create a simple self-checkout system. Prompt for the prices and quantities of three items. Calculate the subtotal of the items. Then calculate the tax using a tax rate of 5.5%. Print out the line items with the quantity and total, and then print out the subtotal, tax amount, and total.

Example Output
Enter the price of item 1: 25
Enter the quantity of item 1: 2
Enter the price of item 2: 10
Enter the quantity of item 2: 1
Enter the price of item 3: 4
Enter the quantity of item 3: 1
Subtotal: $64.00
Tax: $3.52
Total: $67.52
 */


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int quan1, quan2, quan3;
        float price1, price2, price3, subTotal, Tax;
        Scanner in=new Scanner(System.in);

        System.out.print("Enter the price of item 1: ");
        price1=in.nextInt();

        System.out.print("Enter the quantity of item 1: ");
        quan1=in.nextInt();

        System.out.print("Enter the price of item 2: ");
        price2=in.nextInt();

        System.out.print("Enter the quantity of item 2: ");
        quan2=in.nextInt();

        System.out.print("Enter the price of item 3: ");
        price3=in.nextInt();

        System.out.print("Enter the quantity of item 3: ");
        quan3=in.nextInt();

        subTotal = (price1 * quan1) + (price2 * quan2) + (price3 * quan3);






        System.out.println("Subtotal: " +subTotal+ "\nTax: " +(subTotal * 1.055));
    }


}
