import java.util.*;
class doctor{
    int did;
    String name;

    public doctor(int d, String n){
        did=d;
        name=n;
    }

    public void display(){
        System.out.println("Doctor ID :-"+did+ "\nDoctor Name :-"+name);
    }
}
public class parameterized {
    public static void main(String[] args){
            doctor obj = new doctor(101, "Dr.s.n.NIkam");
            obj.display();
    }
}
