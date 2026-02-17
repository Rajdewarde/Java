import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) sum += i;
        }

        if (sum == n && n != 0) {
            System.out.println(n + " is Perfect Number");
        } else {
            System.out.println(n + " is NOT Perfect Number");
        }

        sc.close();
    }
}
