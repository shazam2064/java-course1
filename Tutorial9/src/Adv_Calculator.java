
public class Adv_Calculator extends Basic_Calculator {

    public double multiply(double a, double b) {
        return a*b;

    }

    public double divide (double a, double b) {
        return a/b;
    }

    @Override
    public int add(int a, int b) {
        System.out.println("Adding a and b...");
        return a+b;
    }

    @Override
    public int subtract(int a, int b) {
        return a-b;
    }

}
