import java.util.*;
public class FirstLastCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println("First: "+str.charAt(0));
        System.out.println("Last: "+str.charAt(str.length()-1));
        sc.close();
    }
}