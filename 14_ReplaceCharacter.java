import java.util.*;
public class ReplaceCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char oldChar=sc.next().charAt(0);
        char newChar=sc.next().charAt(0);
        System.out.println(str.replace(oldChar,newChar));
        sc.close();
    }
}