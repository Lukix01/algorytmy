import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Podaj podstawe: ");
        int a = scanner.nextInt();
        int a_input = a;

        System.out.print("Podaj wykladnik: ");
        int n = scanner.nextInt();
        int n_input = n;

        int w = 1;

        while (n > 0) {
            if (n % 2 == 1) {
                w = w * a;
            }
            a = a * a;
            n = n / 2;
        }

        System.out.print(a_input + " do potegi " + n_input + " wynosi: " + w);
    }
}