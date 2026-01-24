import java.util.*;
public class Pass_or_Fail {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter marks");
        int mark=sc.nextInt();

        if(mark >= 35){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
    }
}
