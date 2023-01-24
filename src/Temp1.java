import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Temp1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> list1=new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list1.add(sc.nextInt());
        }
        int num=sc.nextInt();
        long count1 = list1.stream().filter(integer -> integer > num).count();
        System.out.print(count1);
    }
}
