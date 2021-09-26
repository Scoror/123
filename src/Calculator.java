import java.util.InputMismatchException;
import java.util.Scanner;


public class Calculator {
    static Scanner scanner = new Scanner(System.in);
    static int number1, number2;
    static char operation;
    static int result;

    public static void main (String[] args) {
        String userInput = scanner.nextLine();
        char[] char1 = new char[9];
        for (int i = 0; i < userInput.length(); i++) {
            char1[i] = userInput.charAt(i);
            if (char1[i] == '+') {
                operation = '+';
            }
            if (char1[i] == '-') {
                operation = '-';
            }
            if (char1[i] == '*') {
                operation = '*';
            }
            if (char1[i] == '/') {
                operation = '/';
            }
        }
        String under_charString = String.valueOf(char1);
        String[] opera1 = under_charString.split("[+-/*]");
        String stable0 = opera1[0];
        String stable1 = opera1[1];
        String string3 = stable1.trim();
        number1 = romanToNumber(stable0);
        number2 = romanToNumber(string3);

        if (number1 < 0 || number1>10)  {
            if (number2 < 0 || number2>10 ) {
                result = 0;
            }
        } else {
            result = calculated(number1, number2, operation);
            String resultRoman = convertNumToRoman(result);
            System.out.println(resultRoman);
        }
        number1 = Integer.parseInt(stable0);
        number2 = Integer.parseInt(string3);
        result = calculated(number1, number2, operation);
        System.out.println(result);
    }

    private static String convertNumToRoman (int numArabian) {
        String[] roman = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV",
                "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII",
                "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV",
                "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
        };
        final String s = roman[numArabian];
        return s;
    }


    private static int romanToNumber (String roman) {
        try {
            if (roman.equals("I")) {
                return 1;
            } else if (roman.equals("II")) {
                return 2;
            } else if (roman.equals("III")) {
                return 3;
            } else if (roman.equals("IV")) {
                return 4;
            } else if (roman.equals("V")) {
                return 5;
            } else if (roman.equals("VI")) {
                return 6;
            } else if (roman.equals("VII")) {
                return 7;
            } else if (roman.equals("VIII")) {
                return 8;
            } else if (roman.equals("IX")) {
                return 9;
            } else if (roman.equals("X")) {
                return 10;
            }
        } catch (InputMismatchException e) {
            throw new InputMismatchException("throws Exception");
        }
        return -1;
    }

    public static int calculated (int num1, int num2, char op) {
        int result = 0;
        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                try {
                    result = num1 / num2;
                } catch (ArithmeticException | InputMismatchException e) {
                    System.out.println("throws Exception");

                    break;
                }
                break;
            default:
                throw new IllegalArgumentException("throws Exception");
        }
        return result;
    }
}
