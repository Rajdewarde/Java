import java.util.*;
public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char[] a=sc.nextLine().replaceAll(" ","").toLowerCase().toCharArray();
        char[] b=sc.nextLine().replaceAll(" ","").toLowerCase().toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(Arrays.equals(a,b)?"Anagram":"Not Anagram");
        sc.close();
    }
}