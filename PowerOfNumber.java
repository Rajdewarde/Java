import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        long base = sc.nextLong();

        System.out.print("Enter exponent: ");
        int exp = sc.nextInt();

        long result = 1;
        for (int i = 1; i <= exp; i++) {
            result *= base;
        }

        System.out.println("Power = " + result);
        sc.close();
    }
}
