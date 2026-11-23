
import java.util.Objects;

public class demo2 {
    public static void main(String[] args) {
        Student s1 = new Student("Alice",20);
        Student s2 = new Student("Alice",20);
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
    
}

class Student {

    String name;
    int age;

    Student(String name,int age){
        
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return name + " "+ age;
    }

    @Override
    public boolean equals(Object obj){

        if(this == obj) return true;

        if(obj == null || this.getClass() != obj.getClass()) return false;

        Student student = (Student) obj;

        return student.name == this.name && student.age == this.age;
    }
    
    @Override
    public int hashCode(){
        // return Objects.hash(name,age);
        // return name.hashCode() + age;

        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + age;
        return result;
    }
    // objects is also a utility class which is used to perform operations on objects like equals,hashcode etc.
}
