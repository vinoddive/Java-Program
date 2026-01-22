import java.util.*;
public class AddNumbers {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First number ");
        int x =sc.nextInt();

        System.out.println("Enter second number");
        int y =sc.nextInt();

        int z = x + y;
        System.out.println("Addition is :"+ z);
    }
}
