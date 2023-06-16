import java.util.Scanner;

public class DoubleWrapper {

    private double value;

    public DoubleWrapper(double value) {
        this.value = value;
    }

    public double getValue() {
        return this.value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    // Статический метод для сложения двух чисел типа double
    public static double add(double a, double b) {
        return a + b;
    }

    // Статический метод для деления двух чисел типа double
    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }

    // Статический метод для возведения числа типа double в степень
    public static double pow(double a, double b) {
        return Math.pow(a, b);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double a = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double b = scanner.nextDouble();

        DoubleWrapper a1 = new DoubleWrapper(a);
        DoubleWrapper b1 = new DoubleWrapper(b);

        System.out.println("Сумма: " + DoubleWrapper.add(a, b));
        System.out.println("Умножение: " + DoubleWrapper.divide(a, b));
        System.out.println("Возведение в степень: " + DoubleWrapper.pow(a, b));

        scanner.close();
    }
}