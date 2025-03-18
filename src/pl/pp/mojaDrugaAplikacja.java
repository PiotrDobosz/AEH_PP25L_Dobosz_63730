package pl.pp;
import java.util.Scanner;
public class mojaDrugaAplikacja {
    public static void main(String[] args) {
        // Zadanie 2.1
        int x = 10;
        int doubleX = x * 2;
        int squareX = x * x;

        System.out.println("x = " + x);
        System.out.println("Dwukrotność x = " + doubleX);
        System.out.println("x^2 = " + squareX);

        // Zadanie 2.2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swój wiek w latach:");
        int age = scanner.nextInt();

        int ageInSeconds = age * 365 * 24 * 60 * 60;
        System.out.println("Twój wiek w sekundach: " + ageInSeconds);

        scanner.close();
    }
}