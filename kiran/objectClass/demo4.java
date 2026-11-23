
public class demo4 {
    public static void main(String[] args) {
        
        Outer outer = new Outer();
        outer.y = 20;

        Outer.Inner inner = outer.new Inner(outer);
        inner.fun();
    }
}

class Outer {

    static private  int x = 4;
    public int y;
    
    class Inner{
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
