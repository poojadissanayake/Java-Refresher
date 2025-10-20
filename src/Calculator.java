public class Calculator {
    public int add(int a, int b) {
        return a+b;
    }

    public int add(int a, int b, int c) {
        return a+b+c;
    }

    public double add(double a, double b) {
        return a+b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Two int: " + calculator.add(1,2));
        System.out.println("3 Int: " + calculator.add(1,2,3));
        System.out.println("Doubles: " + calculator.add(34.23,10.5));
    }
}

// method overloading - compile time polymorphism