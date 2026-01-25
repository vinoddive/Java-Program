public class largestelement {
    public static void main(String[] args){
        int []arr = {12,2,3,13,24};

        int largest = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }

        System.out.println("Largest element in array "+ largest);
    }
    
}
