import java.util.*;
public class CountConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        int count=0;
        for(char ch: str.toCharArray())
            if(ch>='a'&&ch<='z'&&"aeiou".indexOf(ch)==-1) count++;
        System.out.println("Consonants = "+count);
        sc.close();
    }
}