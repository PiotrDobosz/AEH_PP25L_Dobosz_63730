package pl.pp;
import java.util.Scanner;
public class mojaTrzeciaAplikacja {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj proszę liczbę większą od 100:");
        var number1 = scanner.nextDouble();
        while (number1 <= 100) {
            System.out.println("Liczba nie jest większa od 100, podaj jeszcze raz:");
            number1 = scanner.nextDouble();
        }
        System.out.println("Dziękuję! Podałeś liczbę: " + number1);
        double number2;
        do {
            System.out.println("Podaj proszę liczbę większą od 200:");
            number2 = scanner.nextDouble();
        } while (number2 <= 200);
        System.out.println("Dziękuję! Podałeś liczbę: " + number2);
        int wynik = 0;
        for (var i = 1; i <= 10; i++) {
            wynik = wynik + i;
            System.out.println("Przebieg numer " + i + " w pętli for, a zmienna wynik = " + wynik);
        }
        System.out.println("Podaj proszę liczbę x: ");
        var x = scanner.nextDouble();
        System.out.println("Podaj proszę liczbę y: ");
        var y = scanner.nextDouble();
        if (x > y) {
            System.out.println("x jest większe od y");
        } else if (x < y) {
            System.out.println("x jest mniejsze od y");
        } else {
            System.out.println("x jest równe y");
        }
        while (true) {
            System.out.println("Wpisz wartość -1 żeby wyjść z programu");
            var input = scanner.nextDouble();
            if (input == -1) {
                System.out.println("Wyjście...");
                break;
            }
        }


        int dni;

        while (true) {
            System.out.print("Podaj liczbę dni (wpisz wartość ujemną, aby zakończyć): ");
            dni = scanner.nextInt();

            if (dni < 0) {
                break;
            }

            int tygodnie = dni / 7;
            int resztaDni = dni % 7;
            System.out.println(dni + " dni to " + tygodnie + " tygodnie i " + resztaDni + " dni.");
        }

        System.out.println("Przechodzenie do konwersji temperatur...");
        double celsius;

        while (true) {
            System.out.print("Podaj temperaturę w stopniach Celsjusza (wpisz -1, aby zakończyć): ");
            celsius = scanner.nextDouble();

            if (celsius == -1) {
                break;
            }

            double fahrenheit = 1.8 * celsius + 32.0;
            double kelvin = celsius + 273.16;

            System.out.printf("Celsjusz: %.2f, Fahrenheit: %.2f, Kelwin: %.2f\n", celsius, fahrenheit, kelvin);
        }

        System.out.println("Koniec programu.");
        scanner.close();
    }
}