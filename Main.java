import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner wczytaj = new Scanner(System.in);
        System.out.println("Podaj liczbe nr.1:");
        int a = wczytaj.nextInt();

        System.out.println("Podaj liczbę nr.2:");
        int b = wczytaj.nextInt();

        if (a < b) {
            System.out.println("Kolejność liczb: " + a + ", " + b);

        } else {
            System.out.println("Kolejność liczb: " + b + ", " + a);

        }

    }
}
