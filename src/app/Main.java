package app;

public class Main {
    public static void main(String[] args) {
        double income = 30000;
        double tax = calculateTax(income);
        System.out.println("Сума податку: " + tax);
    }

    public static double calculateTax(double income) {
        double tax;
        if (income <= 10000) {
            tax = income * 0.025;
        } else if (income <= 25000) {
            tax = 10000 * 0.025 + (income - 10000) * 0.043;
        } else {
            tax = 10000 * 0.025 + 15000 * 0.043 + (income - 25000) * 0.067;
        }
        return tax;
    }
}