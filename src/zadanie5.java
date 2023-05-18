import java.util.Scanner;
public class zadanie5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("podaj mase obiektu w kilogramach");
        double masa = scan.nextDouble();
        double ciezar=masa*9.8;
        if (ciezar>1000)
            System.out.println("obiekt jest za ciezki");
        if (ciezar<10)
            System.out.println("obiekt jest za lekki");

        else System.out.println("Ciezar obiektu jest rowny: " + ciezar + " kg");
    }
}
