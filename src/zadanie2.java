import java.util.Scanner;
public class zadanie2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadz dzien miesiaca");
        int dzien = scan.nextInt();
        System.out.println("wprowadz miesiac");
        int miesiac= scan.nextInt();
        System.out.println("Wprowadz dwie ostatnie cyfry roku");
        int rok=scan.nextInt();
        if (dzien*miesiac==rok)
            System.out.println("Rok jest magiczny");
        else System.out.println("rok nie jest magiczny");

    }
}
