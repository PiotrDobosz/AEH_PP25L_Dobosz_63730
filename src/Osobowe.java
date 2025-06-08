public class Osobowe extends Pojazd implements TypPaliwa {
    private final int liczbaDrzwi;
    private final TypPaliwa typPaliwa;

    public Osobowe(String nrRejestracyjny, String numerVin, String kolor, double cena,
                   double spalanie, double poziomPaliwa, double przebieg,
                   int liczbaDrzwi, TypPaliwa typPaliwa) {
        super(nrRejestracyjny, numerVin, kolor, cena, spalanie, poziomPaliwa, przebieg);
        this.liczbaDrzwi = liczbaDrzwi;
        this.typPaliwa = typPaliwa;
    }

    @Override
    public String getTypPaliwa() {
        return typPaliwa.getTypPaliwa();
    }

    @Override
    public void wyswietlInformacje() {
        System.out.println("Samochód osobowy: " + nrRejestracyjny + ", drzwi: " + liczbaDrzwi + ", paliwo: " + getTypPaliwa());
    }
}
