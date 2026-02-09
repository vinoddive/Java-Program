import java.util.*;
public class print_cube {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number");
        int n=sc.nextInt();

        int cube=n*n*n;
        System.out.println("Cube of number :-"+ cube);
    }
}
