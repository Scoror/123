import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Calculator {
    public String[] tokens;
    public int pos;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expr = scanner.nextLine();
        Calculator calculator = new Calculator(expr);
        System.out.println(calculator.calculate());
    }

    public Calculator(String expr) {
        this.tokens = expr.split(" ");
        this.pos = 0;

    }

    public boolean calculate() {

        int a = parseInt(String.valueOf(NumberConvert.checkRome(tokens[0])));
        int b = parseInt(String.valueOf(NumberConvert.checkRome(tokens[2])));
        String operator = tokens[1];
        if (a == 0 || a >= 11 || b == 0 || b >= 11) {
            System.out.println("throws Exception");
        } else if (operator.contains("-")) {
            System.out.println(a - b);
        } else if (operator.contains("+")) {
            System.out.println(a + b);
        } else if (operator.contains("*")) {
            System.out.println(a * b);
        } else if (operator.contains("/")) {
            System.out.println(a / b);
        }
        return true;

    }


}