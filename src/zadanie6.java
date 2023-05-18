import java.util.Scanner;
public class zadanie6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę sekund: ");
        int sekundy = scanner.nextInt();

        if (sekundy >= 86400) {
            int dni = sekundy / 86400;
            System.out.println("Liczba dni: " + dni);
            sekundy %= 86400;
        }

        if (sekundy >= 3600) {
            int godziny = sekundy / 3600;
            System.out.println("Liczba godzin: " + godziny);
            sekundy %= 3600;
        }

        if (sekundy >= 60) {
            int minuty = sekundy / 60;
            System.out.println("Liczba minut: " + minuty);
            sekundy %= 60;
        }

        System.out.println("Liczba sekund: " + sekundy);
    }
}
