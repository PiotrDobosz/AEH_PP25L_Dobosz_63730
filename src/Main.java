import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Przykładowe książki
        List<Ksiazka> ksiazki = new ArrayList<>();
        ksiazki.add(new Podrecznik("Matematyka 1", "Kowalski", "123456", 2021, "Matematyka", new Drukowana()));
        ksiazki.add(new Powiesc("W pustyni i w puszczy", "Sienkiewicz", "789123", 2005, "Przygoda", new EBook()));
        ksiazki.add(new Komiks("Spider-Man", "Marvel", "456789", 2020, true, new Drukowana()));

        boolean dziala = true;

        while (dziala) {
            System.out.println("\n=== MENU BIBLIOTEKI ===");
            System.out.println("1. Wyświetl wszystkie książki");
            System.out.println("2. Wypożycz książkę");
            System.out.println("3. Zwróć książkę");
            System.out.println("4. Wyjście");
            System.out.print("Wybierz opcję: ");

            int wybor = scanner.nextInt();
            scanner.nextLine(); // czyści bufor

            switch (wybor) {
                case 1:
                    System.out.println("\n--- Lista książek ---");
                    for (int i = 0; i < ksiazki.size(); i++) {
                        System.out.print((i + 1) + ". ");
                        ksiazki.get(i).wyswietlInformacje();
                        System.out.println("   Dostępna: " + ksiazki.get(i).isDostepna());
                    }
                    break;

                case 2:
                    System.out.print("Podaj numer książki do wypożyczenia: ");
                    int nrWyp = scanner.nextInt();
                    if (nrWyp >= 1 && nrWyp <= ksiazki.size()) {
                        ksiazki.get(nrWyp - 1).wypozycz();
                    } else {
                        System.out.println("Nieprawidłowy numer.");
                    }
                    break;

                case 3:
                    System.out.print("Podaj numer książki do zwrotu: ");
                    int nrZwr = scanner.nextInt();
                    if (nrZwr >= 1 && nrZwr <= ksiazki.size()) {
                        ksiazki.get(nrZwr - 1).zwroc();
                    } else {
                        System.out.println("Nieprawidłowy numer.");
                    }
                    break;

                case 4:
                    dziala = false;
                    System.out.println("Zamykanie biblioteki...");
                    break;

                default:
                    System.out.println("Nieznana opcja.");
            }
        }

        scanner.close();
    }
}
