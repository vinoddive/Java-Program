import java.util.*;
public class find_small_num_arr {
    public static void main(String[] args){
        int []arr= {10,23,24,12,1,23};

        int smallest = arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }

        System.out.println("Smallest element :"+ smallest);
    }
}
