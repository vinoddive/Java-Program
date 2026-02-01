import java.util.*;
class Employee{
    int id;
    String name;
    
    public void show(){
        System.out.println(id+" "+name);
    }
}
public class class_obj {
    public static void main(String[] args){
        Employee e1 = new Employee();
        Employee e2 = new Employee();

        e1.id=101;
        e1.name="Jay";

        e2.id=102;
        e2.name="Dipak";

        e1.show();
        e2.show();
    }
}
