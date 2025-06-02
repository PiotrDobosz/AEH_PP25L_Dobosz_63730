package pl.pp;

public class Konto {

    private final String numerKonta;
    private double saldo;
    private final String wlasciciel;
    private String email;
    private String numerTelefonu;

    public Konto(String numerKonta, double saldo, String wlasciciel, String email, String numerTelefonu) {
        this.numerKonta = numerKonta;
        this.saldo = saldo;
        this.wlasciciel = wlasciciel;
        this.email = email;
        this.numerTelefonu = numerTelefonu;
    }

    public String getNumerKonta() {
        return numerKonta;
    }

    public String getWlasciciel() {
        return wlasciciel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumerTelefonu() {
        return numerTelefonu;
    }

    public void setNumerTelefonu(String numerTelefonu) {
        this.numerTelefonu = numerTelefonu;
    }

    public void wplata(double kwota) {
        if (kwota > 0) {
            saldo += kwota;
            System.out.println("Wpłata PLN " + kwota + " została wykonana. Nowe saldo = PLN " + saldo);
        } else {
            System.out.println("Wpłata musi być większa niż 0.");
        }
    }

    public void wyplata(double kwota) {
        if (kwota <= saldo) {
            saldo -= kwota;
            System.out.println("Pobrano PLN " + kwota + " z konta, Pozostałe saldo = PLN " + saldo);
        } else {
            System.out.println("Brak środków. Masz PLN " + saldo + " na koncie.");
        }
    }
}

