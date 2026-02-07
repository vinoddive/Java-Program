import java.util.*;
class stud{
    int rollno;
    String name, city, Gender;

    Scanner sc = new Scanner(System.in);
    public stud(){
        rollno=sc.nextInt();
        name=sc.next();
        city=sc.next();
        Gender=sc.next();
    }

    public stud(int r, String n,String c, String g){
       rollno=r;
       name=n;
       city=c;
       Gender=g;
    }

    public void display(){
        System.out.println("Student Rollno :-"+rollno+ "\n Student name :-"+name+"\nStudent City :-"+city+ "\nGender "+Gender);
    }
}
public class construct {
    public static void main(String[] args){
        stud s1 = new stud();
        s1.display();

        stud s2 = new stud(102, "Sham", "Pune", "Male");
        s2.display();
    }
}
