import java.util.*;
class Employees{
    int empid;
    String name;
    double salary;

    public void input(int i, String n, double s){
            empid=i;
            name=n;
            salary=s;
    }

    public void display(){
        System.out.println("Employee ID :-"+empid+"\t Employee Name:- "+name+"\t Salary:-"+salary);
    }
}
public class array_of_object_eg2 {
    public static void main(String[] args){
            Employees emp[] = new Employees[3];
            
            for(int i=0; i<2; i++){
                emp[i] = new Employees();
            }

            emp[0].input(101,"Gaurav",50000 );
            emp[1].input(102, "Saurav", 45000);
           

            for (int i = 0; i < 2; i++) {
                emp[i].display();
        }
    }
}
