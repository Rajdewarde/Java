import java.util.*;
public class UpperLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Uppercase: "+str.toUpperCase());
        System.out.println("Lowercase: "+str.toLowerCase());
        sc.close();
    }
}