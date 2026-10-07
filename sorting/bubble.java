import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
        int nums[] = {5,4,3,2,1};
        bubbles(nums);
        System.out.println(Arrays.toString(nums));
  

    }


    public static void bubbles(int arr[]){
        // BCZ IF ITS ALREADY SWAPPED WHY TO CHECK FOR ALL ITERATION.
        boolean swapped;
        for(int i = 0 ; i<arr.length; i++){

            swapped = false;
            for(int j = 1; j<arr.length-i; j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]= temp;
                    swapped = true;
                }
            }

            // IF FOR A PARTICULAR VALUE OF I IT DID NOT SWAPPPED MATLAB ITS ALREADY SWAPPED.
            if(!swapped){
                break;
            }
        }
    }
}
