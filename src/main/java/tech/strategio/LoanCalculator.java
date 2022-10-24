package tech.strategio;

import java.util.Scanner;

public class LoanCalculator {

    /**
     * TODO: finish out this JavaDoc comment block.
     * FIXME: WHAT DOES THIS METHOD DO?
     * This method takes in a loan amount and calculates the payment for the next 3 months.
     * It then outputs the month, the payment due, and the remaining amount of the loan you have.
     *
     * @param amount this is this loan amount
     * @return the remaining amount after 3 months
     */
    static int getRemainingAmountIn3Months(int amount) {
        // TODO: Add your code below
        for (int i = 0; i < 3; i++)
        {
            int old_amount = amount;
            int ten_percent_amount = (int)(amount * 0.10);
            amount = amount - ten_percent_amount;
            System.out.println("Month " + (i+1));
            System.out.println("Payment: 10% of "+ old_amount + " = " + ten_percent_amount);
            System.out.println("Remaining amount: " + amount);
        }
        return amount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int amount = scanner.nextInt();
        System.out.println(getRemainingAmountIn3Months(amount));
    }
}
