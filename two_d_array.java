import java.util.*;
public class two_d_array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int [2][2];

        System.out.println("Enter elements in array");

        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("2D Array is:");
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
