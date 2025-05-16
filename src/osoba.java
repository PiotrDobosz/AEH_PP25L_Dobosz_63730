import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Osoba {
    private final String imie;
    private final String nazwisko;
    private final String pesel;

    public Osoba(String imie, String nazwisko, String pesel) {
        if (czyPoprawnyPesel(pesel)) {
            throw new IllegalArgumentException("Niepoprawny numer PESEL");
        }
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        String dataUrodzenia = wyznaczDateUrodzenia();
        return "Imię i nazwisko: " + imie + " " + nazwisko + "; data urodzenia: " + dataUrodzenia;
    }

    private String wyznaczDateUrodzenia() {
        int rok = Integer.parseInt(pesel.substring(0, 2));
        int miesiac = Integer.parseInt(pesel.substring(2, 4));
        int dzien = Integer.parseInt(pesel.substring(4, 6));

        int stulecie;
        if (miesiac >= 1 && miesiac <= 12) {
            stulecie = 1900;
        } else if (miesiac >= 21 && miesiac <= 32) {
            stulecie = 2000;
            miesiac -= 20;
        } else if (miesiac >= 41 && miesiac <= 52) {
            stulecie = 2100;
            miesiac -= 40;
        } else if (miesiac >= 61 && miesiac <= 72) {
            stulecie = 2200;
            miesiac -= 60;
        } else if (miesiac >= 81 && miesiac <= 92) {
            stulecie = 1800;
            miesiac -= 80;
        } else {
            return "Nieznana data";
        }

        rok += stulecie;
        LocalDate data = LocalDate.of(rok, miesiac, dzien);
        return data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    private static boolean czyPoprawnyPesel(String pesel) {
        if (pesel == null || !pesel.matches("\\d{11}")) return false;

        int[] wagi = {1, 3, 7, 9, 1, 3, 7, 9, 1, 3};
        int suma = 0;

        for (int i = 0; i < 10; i++) {
            suma += wagi[i] * Character.getNumericValue(pesel.charAt(i));
        }

        int kontrolna = (10 - (suma % 10)) % 10;
        return kontrolna == Character.getNumericValue(pesel.charAt(10));
    }

}