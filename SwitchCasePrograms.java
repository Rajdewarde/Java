import java.util.Scanner;

public class SwitchCasePrograms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1) Check Even/Odd");
        System.out.println("2) Check Vowel/Consonant");
        System.out.println("3) Find Day Name (1-7)");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1: {
                System.out.print("Enter number: ");
                int n = sc.nextInt();
                System.out.println((n % 2 == 0) ? "Even" : "Odd");
                break;
            }
            case 2: {
                System.out.print("Enter character: ");
                char ch = sc.next().toLowerCase().charAt(0);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    System.out.println("Vowel");
                } else {
                    System.out.println("Consonant");
                }
                break;
            }
            case 3: {
                System.out.print("Enter day number: ");
                int d = sc.nextInt();
                switch (d) {
                    case 1: System.out.println("Monday"); break;
                    case 2: System.out.println("Tuesday"); break;
                    case 3: System.out.println("Wednesday"); break;
                    case 4: System.out.println("Thursday"); break;
                    case 5: System.out.println("Friday"); break;
                    case 6: System.out.println("Saturday"); break;
                    case 7: System.out.println("Sunday"); break;
                    default: System.out.println("Invalid day");
                }
                break;
            }
            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}
