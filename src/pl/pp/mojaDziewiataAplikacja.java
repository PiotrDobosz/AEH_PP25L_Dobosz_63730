package pl.pp;

public class mojaDziewiataAplikacja {
    public static void main(String[] args) {
        // Tworzymy nowy magazyn
        Magazyn magazyn = new Magazyn(101, 500, "magazyn@firma.pl", "123-456-789");

        // Dodajemy towary
        magazyn.dodajTowar(200);
        magazyn.sprawdzZajetosc();

        // Próba dodania zbyt dużej ilości
        magazyn.dodajTowar(400); // powinien wyświetlić komunikat o braku miejsca

        // Usuwamy towar
        magazyn.usunTowar(50);
        magazyn.sprawdzZajetosc();

        // Próba usunięcia zbyt dużej ilości
        magazyn.usunTowar(1000); // powinien wyświetlić ostrzeżenie

        // Aktualizacja danych kontaktowych
        magazyn.aktualizujKontakt("nowy@email.com", "987-654-321");
    }
}
