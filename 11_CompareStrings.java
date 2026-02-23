import java.util.*;
public class CompareStrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        System.out.println(a.equals(b)?"Equal":"Not Equal");
        sc.close();
    }
}