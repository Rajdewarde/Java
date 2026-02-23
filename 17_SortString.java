import java.util.*;
public class SortString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char[] arr=sc.nextLine().toCharArray();
        Arrays.sort(arr);
        System.out.println(new String(arr));
        sc.close();
    }
}