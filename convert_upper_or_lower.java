import java.util.*;
public class convert_upper_or_lower {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String name = sc.next();

        System.out.println("Convert Lowercase : " + name.toLowerCase());
        System.out.println("Convert Uppercase : "+ name.toUpperCase());
    }
    
}
