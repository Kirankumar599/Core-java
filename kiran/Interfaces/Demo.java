package kiran.Interfaces;

public class Demo {
    public static void main(String[] args) {

        Calculator calculator = new CasioCalculator();
        System.out.println("Addition: " + calculator.add(10, 5));   
        System.out.println("Subtraction: " + calculator.sub(10, 5));
        System.out.println("Multiplication: " + calculator.mul(10, 5)); 
        System.out.println("Division: " + calculator.div(10, 5));
    }
}

interface Constants {

    public static final double PI = 3.14;
    public static final int MAX_VALUE = 100;

}
interface Calculator {
    
    int add(int a,int b);
    int sub(int a,int b);
    int mul(int a,int b);
    int div(int a,int b);

    private void display(){
        System.out.println("This is a private method in the interface");
    }
}

class CasioCalculator implements Calculator,Constants {

    @Override
    public int add(int a,int b){
        return a+b;
    }

    @Override
    public int sub(int a,int b){
        return a-b;
    }

    @Override
    public int mul(int a,int b){
        return a*b;
    }

    @Override
    public int div(int a,int b){
        if(b == 0){
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a/b;
    }
}
