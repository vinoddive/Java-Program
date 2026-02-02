import java.util.Scanner;

class Person {
    String name;

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        name = sc.next();
    }

    void showData() {
        System.out.println("Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.getData();
        p.showData();
    }
}
