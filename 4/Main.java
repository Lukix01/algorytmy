import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 0;
        int k = 2;

        System.out.print("Podaj liczbe: ");
        n = scanner.nextInt();

        System.out.print("Czynniki pierwsze liczby " + n + ": ");
        
        while (n > 1) {
            while (n % k == 0) {
                System.out.print(k + " ");
                n = n / k;
            }
            k++;
        }

    }
}