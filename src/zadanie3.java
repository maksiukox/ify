import java.util.Scanner;
public class zadanie3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadz swoja wage w kilogramach");
        double waga = scan.nextDouble();
        System.out.println("Wprowadz swoj wzrost w metrach");
        double wzrost = scan.nextDouble();
        double bmi=waga/(wzrost*wzrost);
        if (bmi>25)
        System.out.println("Twoje bmi wynosi: " + bmi + " i jest to: nadwaga");
        else if (bmi<=25 && bmi>18.5)
            System.out.println("Twoje bmi wynosi: " + bmi + " i jest to: waga prawidlowa");
        else System.out.println("Twoje bmi wynosi: " + bmi + " i jest to: niedowaga");


    }
}
