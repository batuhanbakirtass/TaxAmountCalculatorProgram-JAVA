import java.util.Scanner;

public class TaxAmountCalculatorProgram {
    public static void main(String[] args) {
        double amount, taxRate, taxAmount, totalAmount;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Amount : ");
        amount = input.nextDouble();

        taxRate = (amount > 0 && amount <= 1000) ? 0.18 : 0.08;
        taxAmount = amount * taxRate;
        totalAmount = amount + taxAmount;

        System.out.println("Amount Without Tax : " + amount);
        System.out.println("Tax Rate : " + taxRate);
        System.out.println("Tax Amount : " + taxAmount);
        System.out.println("Total Amount : " + totalAmount);

    }
}
