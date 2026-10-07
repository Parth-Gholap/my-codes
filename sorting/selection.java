import java.util.Arrays;

public class selection {
    public static void main(String[] args) {
        int nums[] = {5, 4, 3, 2, 1};

        selections(nums);

        System.out.println(Arrays.toString(nums));
    }

    public static void selections(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxnum = getmax(arr, 0, last);

            swap(arr, last, maxnum);
        }
    }

    private static int getmax(int arr[], int start, int end) {
        int max = start;

        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }

        return max;
    }

    public static void swap(int arr[], int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}