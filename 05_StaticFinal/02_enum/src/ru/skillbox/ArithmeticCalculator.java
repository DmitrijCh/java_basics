package ru.skillbox;

public class ArithmeticCalculator {
    public int firstNumber;
    public int secondNumber;

    public ArithmeticCalculator(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public void calculate(Operation operation) {
        if (operation == Operation.ADD) {
            System.out.println(firstNumber + secondNumber);
        } else if (operation == Operation.SUBTRACT) {
            System.out.println(firstNumber - secondNumber);
        } else if (operation == Operation.MULTIPLY) {
            System.out.println(firstNumber * secondNumber);

//            switch (operation) {
//                case ADD -> System.out.println(firstNumber + secondNumber);
//
//                // performs subtraction between numbers
//                case SUBTRACT -> System.out.println(firstNumber - secondNumber);
//
//                // performs multiplication between numbers
//                case MULTIPLY -> System.out.println(firstNumber * secondNumber);
//            }

        }
    }
}











