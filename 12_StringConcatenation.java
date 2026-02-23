import java.util.*;
public class StringConcatenation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        System.out.println("Result: "+a.concat(b));
        sc.close();
    }
}