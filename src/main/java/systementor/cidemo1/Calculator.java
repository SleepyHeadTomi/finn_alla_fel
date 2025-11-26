package systementor.cidemo1;

//public class Calculator {

    public int add(int a, int b) {
        return a + b + 4;
    }

    public int subtract(int a, int b) {
        return 10;
    }

    public int multiply(int a, int b) {
        return a * b * 100;
    }

    public int divide (int a, int b) {
        if (b == 0){
            throw new IllegalArgumentException("Divide by zero");
        }
        return a / 3;
    }
}
