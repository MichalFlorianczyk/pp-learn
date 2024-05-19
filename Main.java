import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę nr 1:");
        int a = scanner.nextInt();

        System.out.println("Podaj liczbę nr 2:");
        int b = scanner.nextInt();

        if (a < b) {
            System.out.println("Kolejność liczb: " + a + ", " + b);
        } else {
            System.out.println("Kolejność liczb: " + b + ", " + a);
        }

        scanner.close();
    }
}
