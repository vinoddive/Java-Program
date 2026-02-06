import java.util.*;
class student{
     int Rollno;
     String Name;
    public student(){
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter Values");
       Rollno=sc.nextInt();
       Name=sc.next();

       System.out.println("Rollno of Student :- "+Rollno+"\nName of Student :-"+Name);

    }
}
public class Constructor_eg {
    public static void main(String[] args){
        student obj = new student();
    }
}
