import java.util.Scanner; 

public class Main {
  public static void main(String[] args) {

    try (Scanner scanner = new Scanner(System.in)) {
      System.out.print("Podaj liczbe a: ");
      int a = scanner.nextInt();

      System.out.print("Podaj licbze b: ");
      int b = scanner.nextInt();

      if (a > b) {
        System.out.println(a - b);
      } else {
        System.out.println(b - a);
      }
    }
  }
}