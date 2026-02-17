import java.util.Scanner;

public class GcdLcm {
    static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return Math.abs(a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        int g = gcd(a, b);
        long l = (long) Math.abs(a) * Math.abs(b) / g;

        System.out.println("GCD = " + g);
        System.out.println("LCM = " + l);

        sc.close();
    }
}
