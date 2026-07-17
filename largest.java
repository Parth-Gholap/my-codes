public class largest {
    public static void main(String[] args) {
        int arr[] = {1, 33, 12, 44, 66, 14};
        max(arr);
    }

    static void max(int arr[]) {
        int maxx = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxx) {
                maxx = arr[i];
            }
        }

        System.out.println(maxx);
    }
}