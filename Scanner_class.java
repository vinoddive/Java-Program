import java.util.*;
public class Scanner_class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.next();

        System.out.println("Input String is: " + s);
        sc.close();
    }
}
