import java.util.*;
class Employee{
    int Empid;
    String Name;
    Double Salary;
    Scanner sc = new Scanner(System.in);
    public void put(){
        System.out.println("Enter Employee Details");
        Empid=sc.nextInt();
        Name=sc.next();
        Salary=sc.nextDouble();
    }
}

class Derive extends Employee{
    public void display(){
        System.out.println("Employee ID:-"+Empid+"\tEmployee Name:-"+Name+"\tEmployee Salary"+Salary);
    }
}

public class Single_Inherit {
    public static void main(String[] args){
        Derive obj = new Derive();
        obj.put();
        obj.display();
    }
}
