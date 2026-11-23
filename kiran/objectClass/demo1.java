
public class demo1 {
    public static void main(String[] args) {
        
        Outer outer = new Outer();
        outer.y = 20;

        Outer.Inner inner = new Outer.Inner(outer);
        inner.fun();


    }   
}

class Outer {

    static private  int x = 4;
    public int y;

    static class Inner{
        Outer outer;

        public Inner(Outer outer){
            this.outer = outer;
        }

        void fun(){
            System.out.println("Radhe Radhe");
            System.out.println(x);
            System.out.println(outer.y);
        }
    }
}

// example

class BankAccount {

    private static class InterestCalculator{
        public static double claculateYearly(double principal,double rate){
            return principal*rate;
        }
    }

    public double calculatePrincipal(double principal){
        return InterestCalculator.claculateYearly(principal,0.09);
    }
}
