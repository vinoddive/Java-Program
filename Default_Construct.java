import java.util.*;
class Emp{
    int EId;
    String name;

    public Emp(){
        Scanner sc = new Scanner(System.in);
        EId=sc.nextInt();
        name=sc.next();
 
    }

    public void display(){
        System.out.println("Employee Id :-"+EId+ "\n Employee Name :-"+name);
    }
}
public class Default_Construct {
    public static void main(String[] args){
        Emp obj = new Emp();
        obj.display();
    }
}
