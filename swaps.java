import java.util.Arrays;

public class swaps {
    public static void swap(int arr[], int i1 , int i2){
        int temp = arr[i1];
        arr[i1]= arr[i2];
        arr[i2]= temp;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        swap(arr,2,3);
        System.out.println(Arrays.toString(arr));
    }
    
}
