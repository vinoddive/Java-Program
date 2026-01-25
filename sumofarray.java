import java.util.*;
public class sumofarray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int [] arr = new int[5];

        System.out.println("Enter numbers in array");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }

        System.out.println("Sum of array is :" + sum);
    }
}
