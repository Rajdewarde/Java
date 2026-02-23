import java.util.*;
public class StringInputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("You entered: " + str);
        sc.close();
    }
}