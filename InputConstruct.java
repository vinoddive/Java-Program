import java.util.*;

class Person {
    int age;

    public Person() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age:");
        age = sc.nextInt();
    }

    public void display() {
        System.out.println("Age = " + age);
    }
}

public class InputConstruct {
    public static void main(String[] args) {
        Person obj = new Person();
        obj.display();
    }
}
