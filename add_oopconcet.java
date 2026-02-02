import java.util.*;
class myclass{
    private int a,b,c;
    Scanner sc = new Scanner(System.in);

    public void add(){
        a=sc.nextInt();
        b=sc.nextInt();
        c=a+b;
        System.out.println(c);
    }
}
public class add_oopconcet {
    public static void main(String[] agr){
        myclass m = new myclass();
        m.add();
    }
}
