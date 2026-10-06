import java.util.ArrayList;
import java.util.Scanner;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(110);
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<5 ;i++){
            list.add(sc.nextInt());
        }
        System.out.println(list);
sc.close();
        }
}
