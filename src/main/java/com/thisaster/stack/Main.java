package com.thisaster.stack;

public class Main {
    public static void main(String[] args) {
        var stack = new StackThroughArray();
        var expr = "3 2 + 4 5 + *";
        String[] tokens = expr.split(" ");
        for (String token : tokens) {
            float a = 0;
            float b = 0;
            switch (token) {
                case "+":
                    b = (float) stack.pop();
                    a = (float) stack.pop();
                    stack.push(a + b);
                    break;
                case "-":
                    b = (float) stack.pop();
                    a = (float) stack.pop();
                    stack.push(a - b);
                    break;
                case "*":
                    b = (float) stack.pop();
                    a = (float) stack.pop();
                    stack.push(a * b);
                    break;
                case "/":
                    b = (float) stack.pop();
                    a = (float) stack.pop();
                    stack.push(a / b);
                    break;
                default:
                    stack.push(Float.parseFloat(token));
            }
        }
        System.out.println(stack.pop());
    }
}
