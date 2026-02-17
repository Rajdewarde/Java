import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        long n = sc.nextLong();

        if (n == 0) {
            System.out.println("Digits = 1");
            sc.close();
            return;
        }

        int count = 0;
        n = Math.abs(n);

        while (n != 0) {
            count++;
            n /= 10;
        }

        System.out.println("Digits = " + count);
        sc.close();
    }
}
