public class Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double min(double a, double b) {

        return a - b;
    }

    public double multi(double a, double b) {
        return a * b;
    }

    public double div(double a, double b) {
        if(b == 0.0)
            throw new ArithmeticException(); // obsługa wyjątku dzienienia przez 0
        return a / b;
    }

    public static void main(String[] args) {

        Calculator calculatror = new Calculator();
        assert 5.0 == calculatror.add(2, 5);
    }
}