package com.example;

public class Main {
    public static void main(String[] args) {
        String exp = "(1+((2+3)*(4*5)))";
        int result = calculateFromString(exp);

        System.out.println("Das Ergebnis von dieser Rechenkette lautet: " + result);
    }

    public static int calculateFromString(String exp) {
        IntStack zahlenStack = new IntStack();
        CharStack objektStack = new CharStack();

        for (int i = 0; i < exp.length(); i++) {
            char tmp = exp.charAt(i);

            if (Character.isDigit(tmp)) {
                zahlenStack.push(Character.getNumericValue(tmp));
            } else if (tmp == '+' || tmp == '-' || tmp == '*' || tmp == '/') {
                objektStack.push(tmp);
            } else if (tmp == ')') {
                int z1 = zahlenStack.pop().data;
                int z2 = zahlenStack.pop().data;
                char op = objektStack.pop().data;
                int result;

                switch (op) {
                    case '+':
                        result = z1 + z2;
                        break;
                    case '-':
                        result = z2 - z1;
                        break;
                    case '*':
                        result = z1 * z2;
                        break;
                    case '/':
                        result = z1 / z2;
                        break;
                    default:
                        result = -99999;
                        break;
                }
                zahlenStack.push(result);
            }

        }
        return zahlenStack.pop().data;
    }

    

}