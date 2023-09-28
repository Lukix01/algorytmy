import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int[] tab = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47};

       int l = 0;
       int p = 15;
       int sr = (l + p) / 2;
       
       Scanner scanner = new Scanner(System.in);
       System.out.print("Podaj liczbe ktora chcesz znalezc: ");
       
       int szukana = scanner.nextInt();

       while (l <= p) {
        if (tab[sr] == szukana) {
            System.out.println(sr);
            return;
        } else if (tab[sr] > szukana) {
            p = sr - 1;
        } else {
            l = sr + 1;
        }
        sr = (l + p) / 2;
       }
    }
}