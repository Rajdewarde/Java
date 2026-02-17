import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Fahrenheit: ");
        double f = sc.nextDouble();

        double c = (f - 32) * 5 / 9;
        System.out.println("Celsius = " + c);

        sc.close();
    }
}
