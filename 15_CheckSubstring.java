import java.util.*;
public class CheckSubstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String sub=sc.nextLine();
        System.out.println(str.contains(sub)?"Found":"Not Found");
        sc.close();
    }
}