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
        DoubleWrapper dw = new DoubleWrapper(5.0);
        System.out.println("Value is: " + dw.getValue());
        System.out.println("Sum of 5.0 and 3.0: " + DoubleWrapper.add(5.0, 3.0));
        System.out.println("Dividing 10.0 by 5.0: " + DoubleWrapper.divide(10.0, 5.0));
        System.out.println("5.0 to the power of 3: " + DoubleWrapper.pow(5.0, 3));
    }
}