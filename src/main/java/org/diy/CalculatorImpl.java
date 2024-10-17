package org.diy;

public class CalculatorImpl implements Calculator{

    @Override
    public int addition(int a, int b){
        return a+b;
    }

    @Override
    public int subtraction(int a, int b){
        return a-b;
    }

    @Override
    public int multiplication(int a, int b){
        return a*b;
    }

    @Override
    public int division(int a, int b) {
        if (b == 0){
            throw new ArithmeticException();
        }
        return a/b;
    }

    @Override
    public Integer remainder(int a, int b){
        return a%b;
    }

}
