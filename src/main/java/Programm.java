import app.HomeWork16.Calculator;

public class Programm {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(2.9,5.4));
        System.out.println(calculator.minus(4.8,2.1));
        System.out.println(calculator.multiply(3.3,9.9));
        System.out.println(calculator.divide(4.1,2.3));
        System.out.println(calculator.divide(2.2, 0));
    }
}
