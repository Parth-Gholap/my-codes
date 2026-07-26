public class linearrange {
    public static void main(String[] args) {
        int arr[] = {22,11,29,99};
        int tar = 100;
        int ans = range(arr, tar, 1, 3);
        System.out.println(ans);

    }
    

    static int range(int arr[], int tar , int st, int end){
        if(arr.length == 0){
            return -1;
        }

        for(int i =st ; i< end ; i++){
            if(arr[i] == tar){
                return i;
            }
        }
        return -1;
    }
}
