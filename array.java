import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers : ");
        for(int i = 0 ; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Numbers are : ");
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
