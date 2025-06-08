package pl.pp;

public class Magazyn {

    private final int numerMagazynu;
    private final int calkowitaPrzestrzen;
    private int zajetaPrzestrzen;
    private String email;
    private String numerTelefonu;

    public Magazyn(int numerMagazynu, int calkowitaPrzestrzen, String email, String numerTelefonu) {
        this.numerMagazynu = numerMagazynu;
        this.calkowitaPrzestrzen = calkowitaPrzestrzen;
        this.zajetaPrzestrzen = 0;
        this.email = email;
        this.numerTelefonu = numerTelefonu;
    }

    public void dodajTowar(int ilosc) {
        if (zajetaPrzestrzen + ilosc <= calkowitaPrzestrzen) {
            zajetaPrzestrzen += ilosc;
            System.out.println("Dodano " + ilosc + " jednostek towaru.");
        } else {
            System.out.println("Brak miejsca! Dostępne tylko " + (calkowitaPrzestrzen - zajetaPrzestrzen) + " jednostek.");
        }
    }

    public void usunTowar(int ilosc) {
        if (ilosc <= zajetaPrzestrzen) {
            zajetaPrzestrzen -= ilosc;
            System.out.println("Usunięto " + ilosc + " jednostek towaru.");
        } else {
            System.out.println("Nie można usunąć więcej niż zajęte: " + zajetaPrzestrzen + " jednostek.");
        }
    }

    public void sprawdzZajetosc() {
        int wolne = calkowitaPrzestrzen - zajetaPrzestrzen;
        System.out.println("Magazyn nr " + numerMagazynu + ": Zajęte " + zajetaPrzestrzen + ", wolne " + wolne);
    }

    public void aktualizujKontakt(String email, String numerTelefonu) {
        this.email = email;
        this.numerTelefonu = numerTelefonu;
        System.out.println("Nowe dane kontaktowe:");
        System.out.println("Email: " + this.email);
        System.out.println("Telefon: " + this.numerTelefonu);
    }
}
