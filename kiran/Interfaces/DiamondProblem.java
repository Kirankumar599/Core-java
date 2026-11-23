package kiran.Interfaces;

public class DiamondProblem {
    public static void main(String[] args) {
       
        B obj = new impl();
            obj.display();
            obj.fun();

    }
}

interface A {
    default void display() {
        System.out.println("Display method from interface A");
    }
    void fun();
}
interface B extends A {
    default void display() {
        System.out.println("Display method from interface B");
    }
    
}

interface C extends A {
    default void display() {
        System.out.println("Display method from interface C");
    }
}
class impl implements B, C {
    @Override
    public void display() {
        C.super.display();
        B.super.display();
        System.out.println("Display method from class impl");
    }

    @Override
    public void fun() {
        System.out.println("Haa haa");
    }
}
