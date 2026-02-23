import java.util.*;
public class StringFrequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(str.indexOf(ch)==i)
                System.out.println(ch+" = "+(str.length()-str.replace(""+ch,"").length()));
        }
        sc.close();
    }
}