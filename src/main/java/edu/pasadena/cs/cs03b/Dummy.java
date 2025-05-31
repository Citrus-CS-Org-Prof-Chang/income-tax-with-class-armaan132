package edu.pasadena.cs.cs03b;

import java.util.Scanner;

public class Dummy {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaxTableTools taxTool = new TaxTableTools();

        while (true) {
            System.out.print("Enter annual income (-1 to exit): ");
            double income = scanner.nextDouble();

            if (income == -1) {
                break;
            }

            taxTool.setSalary(income);
            double rate = taxTool.getTaxRate();
            double tax = taxTool.calculateTax();

            System.out.println("Annual Income: " + String.format("%.2f", income) +
                   " Tax rate: " + String.format("%.2f", rate) +
                   " Tax to pay: " + String.format("%.2f", tax));
        }

        scanner.close();
    }

	public static int dummy() {
		
		
		// TOOD: add your logic here

		return 1;
	}

}
