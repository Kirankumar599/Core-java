
public class demo3 {

    public static void main(String[] args) throws CloneNotSupportedException {

        A a = new A();
        A b = new B();

        System.out.println(a.getClass().getName());
        System.out.println(b.getClass().getName());

        System.out.println(a instanceof A);
        System.out.println(b instanceof B);
        System.out.println(b instanceof A);


        Student s1 = new Student("John", 20);
        Student s2 = null;
        s2 = (Student) s1.clone();
        System.out.println("s1: " + s1.name + ", " + s1.age);
        System.out.println("s2: " + s2.name + ", " + s2.age);

        System.out.println("s1 == s2: " + (s1 == s2));

    }
}

class A {

}

class B extends A {

 }

 class Student implements Cloneable {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

 }
