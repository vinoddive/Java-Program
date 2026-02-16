import java.util.*;
class base{
    int Rollno;
    String Name, Gender;
    Scanner sc = new Scanner(System.in);
    public void input(){
        System.out.println("Enter Student detail");
        Rollno=sc.nextInt();
        Name=sc.next();
        Gender=sc.next();
    }
}
class derive extends base{
    public void display(){
        System.out.println("RollNo of Student:-"+Rollno+"\tName of Student:-"+Name+"\tGender:-"+Gender);
    }
}
public class Inheritance_eg {
    public static void main(String[] args){
        derive obj = new derive();
        obj.input();
        obj.display();
    }
}
