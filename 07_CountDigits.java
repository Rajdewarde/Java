import java.util.*;
public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count=0;
        for(char ch: str.toCharArray())
            if(Character.isDigit(ch)) count++;
        System.out.println("Digits = "+count);
        sc.close();
    }
}