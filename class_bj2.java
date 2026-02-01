class car{
    String Brand;

    public void display(){
        System.out.println("Car Name is :" + Brand);
    }
}
public class class_bj2 {
    public static void main(String[] args){
        car c = new car();

        c.Brand="TOYOTA";
        c.display();
    }
}
