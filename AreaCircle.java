import java.util.*;

class Calc {
    public void calc(int r) {
        float PI = 3.14f;
        double a = PI * r * r;
        System.out.println("Area of circle: " + a);
    }
}

public class AreaCircle {
    public static void main(String[] args) {
        Calc obj = new Calc();
        obj.calc(5);
    }
}
