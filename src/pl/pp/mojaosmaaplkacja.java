package pl.pp;

public class mojaosmaaplkacja {
    public static void main(String[] args) {
        Konto konto1 = new Konto("1234567890", 1000.0, "Jan Kowalski", "jan@example.com", "500600700");

        konto1.wyplata(900.0);
        konto1.wplata(250.0);
        konto1.wyplata(50.0);
        konto1.wyplata(500.0);


        System.out.println("Właściciel konta: " + konto1.getWlasciciel());
        System.out.println("Numer konta: " + konto1.getNumerKonta());
        System.out.println("Email: " + konto1.getEmail());
        System.out.println("Telefon: " + konto1.getNumerTelefonu());


        konto1.setEmail("nowy.email@example.com");
        konto1.setNumerTelefonu("700800900");

        System.out.println("Zmieniony email: " + konto1.getEmail());
        System.out.println("Zmieniony numer telefonu: " + konto1.getNumerTelefonu());
    }
}
