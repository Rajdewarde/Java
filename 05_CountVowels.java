import java.util.*;
public class CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        int count=0;
        for(char ch: str.toCharArray())
            if("aeiou".indexOf(ch)!=-1) count++;
        System.out.println("Vowels = "+count);
        sc.close();
    }
}