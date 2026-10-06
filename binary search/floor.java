
public class floor{
    public static void main(String[] args) {
        int arr [] = {1,3,4,5,6,7,8,9};
        int tar = 2;
        int ans = ceilings(arr, tar);
        System.out.println(ans);
    }
    

    static int ceilings(int arr[], int tar){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
           int mid = start +(end-start)/2;
           if(arr[mid]==tar){
            return arr[mid];
           }
           else if(arr[mid]>tar){
            end = mid -1;
           }
           else if(arr[mid]<tar){
            start = mid + 1;
           }
        }
        return arr[end];
    }
}