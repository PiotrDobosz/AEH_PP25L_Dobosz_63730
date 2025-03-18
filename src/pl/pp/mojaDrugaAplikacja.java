package pl.pp;
import java.util.Scanner;
public class mojaDrugaAplikacja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swój wiek w latach:");
        int age = scanner.nextInt();

        int ageInSeconds = age * 365 * 24 * 60 * 60;
        System.out.println("Twój wiek w sekundach: " + ageInSeconds);

        scanner.close();
    }
    }