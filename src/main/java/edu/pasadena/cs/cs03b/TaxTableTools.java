package edu.pasadena.cs.cs03b;

public class TaxTableTools {
    private double salary;
    private final int[] salaryBrackets = {0, 20000, 50000, 100000, Integer.MAX_VALUE};
    private final double[] taxRates = {0.0, 0.10, 0.20, 0.30, 0.40};

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getTaxRate() {
        for (int i = 0; i < salaryBrackets.length - 1; i++) {
            if (salary >= salaryBrackets[i] && salary < salaryBrackets[i + 1]) {
                return taxRates[i];
            }
        }
        return 0.0;
    }

    public double calculateTax() {
        return salary * getTaxRate();
    }
}
