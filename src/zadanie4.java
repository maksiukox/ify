import java.util.Scanner;
public class zadanie4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadz wynik z pierwszego testu");
        double ocenaA = scan.nextDouble();
        System.out.println("Wprowadz wynik z drugiego testu");
        double ocenaB = scan.nextDouble();
        System.out.println("Wprowadz wynik z trzeciego testu");
        double ocenaC = scan.nextDouble();
        double srednia=(ocenaA+ocenaB+ocenaC)/3;
        if (srednia<100 && srednia>=90)
            System.out.println("5");
        else if (srednia<90 && srednia>=80)
            System.out.println("4");
         else if (srednia<80 && srednia>=70)
            System.out.println("3");
         else if (srednia<70 && srednia>=60)
            System.out.println("2");
         else System.out.println("1");


    }
}
