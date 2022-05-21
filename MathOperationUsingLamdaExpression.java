package com.bridgelabz.lamdaExpressions.mathOperation;

public class MathOperationUsingLamdaExpression {
    public static void main(String[] args) {
        Calculator addition = (a, b) -> a + b;
        System.out.println("Addition is: " +addition.calculation(20,10));
        Calculator subtraction = (a, b) -> a - b;
        System.out.println("Subtraction is: " +subtraction.calculation(20,10));
        Calculator multiplication = (a, b) -> a * b;
        System.out.println("Multiplication is: " +multiplication.calculation(20,2));
        Calculator division = (a, b) -> a / b;
        System.out.println("Division is: " +division.calculation(20,5));
    }
}
