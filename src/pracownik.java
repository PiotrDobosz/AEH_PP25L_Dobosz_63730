class Pracownik extends Osoba {
    private final String stanowisko;
    private final double pensja;

    public Pracownik(String imie, String nazwisko, String pesel, String stanowisko, double pensja) {
        super(imie, nazwisko, pesel);
        this.stanowisko = stanowisko;
        this.pensja = pensja;
    }

    public double getPensja() {
        return pensja;
    }

    @Override
    public String toString() {
        return super.toString() + "; stanowisko: " + stanowisko + "; pensja: " + pensja;
    }

    public double obliczRoczneWynagrodzenie() {
        return pensja * 12;
    }
}

