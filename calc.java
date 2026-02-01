import java.util.*;
class calcc{
    int a,b;
    public void add(){
        System.out.println(a+b);
    }

    public void sub(){
        System.out.println(a-b);
    }

    public void malti(){
        System.out.println(a*b);
    }

    public void div(){
        System.out.println(a/b);
    }
}
public class calc {
    public static void main(String[] args){
        calcc obj = new calcc();

        obj.a=10;
        obj.b=5;

        obj.add();
        obj.sub();
        obj.malti();
        obj.div();
    }
}
