package pl.pp;

import java.util.Scanner;

class mojaCzwartaAplikacja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//Zad. 2.1
        while (true) {
            System.out.print("Enter lower and upper integer limits: ");
            int lower = scanner.nextInt();
            int upper = scanner.nextInt();

            if (lower == upper) {
                System.out.println("Done");
                break;
            }

            int sum = 0;
            for (int i = lower; i <= upper; i++) {
                sum += i * i;
            }

            System.out.println("The sum of the squares from " + lower + " to " + upper + " is " + sum);
        }
        //Zad. 2.2
        while (true) {
            System.out.println("\nMenu kalkulatora:");
            System.out.println("1. Dodawanie");
            System.out.println("2. Odejmowanie");
            System.out.println("3. Mnożenie");
            System.out.println("4. Dzielenie");
            System.out.println("5. Wyjście");
            System.out.print("Wybierz opcję: ");

            int wybor = scanner.nextInt();
            if (wybor == 5) {
                System.out.println("Zakończono program.");
                break;
            }

            System.out.print("Podaj pierwszą liczbę: ");
            double a = scanner.nextDouble();
            System.out.print("Podaj drugą liczbę: ");
            double b = scanner.nextDouble();

            switch (wybor) {
                case 1:
                    System.out.println("Wynik: " + (a + b));
                    break;
                case 2:
                    System.out.println("Wynik: " + (a - b));
                    break;
                case 3:
                    System.out.println("Wynik: " + (a * b));
                    break;
                case 4:
                    if (b != 0) {
                        System.out.println("Wynik: " + (a / b));
                    } else {
                        System.out.println("Błąd: dzielenie przez zero!");
                    }
                    break;
                default:
                    System.out.println("Niepoprawny wybór, spróbuj ponownie.");
            }
        }

        scanner.close();
    }
}