package com.calculator.simplecalculator;

public class Calculator {

    public int addAToB(int a, int b) {
        return a + b;
    }

    public int substractAFromB(int a, int b) {
        return a - b;
    }

    public void someMethod(){
        System.out.println("It works!");
    }
}

class Application
{
    public static void main(String[] args) {

        Calculator simpleCalculator1 = new Calculator();
        int result1 = simpleCalculator1.addAToB(7, 12);
        System.out.println("Result A + B is: " + result1);

        Calculator simpleCalculator2 = new Calculator();
        int result2 = simpleCalculator2.substractAFromB(11, 4);
        System.out.println("Result A - B is: " + result2);

        Calculator simpleCalculator3 = new Calculator();
        simpleCalculator3.someMethod();

        System.out.println("Test222");
        System.out.println("Test 3");


    }

}