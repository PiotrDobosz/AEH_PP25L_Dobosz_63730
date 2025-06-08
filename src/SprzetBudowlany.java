public class SprzetBudowlany extends Pojazd implements TypPaliwa {
    private final int przepracowaneGodziny;
    private final TypPaliwa typPaliwa;

    public SprzetBudowlany(String nrRejestracyjny, String numerVin, String kolor, double cena,
                           double spalanie, double poziomPaliwa, double przebieg,
                           int przepracowaneGodziny, TypPaliwa typPaliwa) {
        super(nrRejestracyjny, numerVin, kolor, cena, spalanie, poziomPaliwa, przebieg);
        this.przepracowaneGodziny = przepracowaneGodziny;
        this.typPaliwa = typPaliwa;
    }

    @Override
    public String getTypPaliwa() {
        return typPaliwa.getTypPaliwa();
    }

    @Override
    public void wyswietlInformacje() {
        System.out.println("Sprzęt budowlany: " + nrRejestracyjny + ", przepracowane godziny: " + przepracowaneGodziny + ", paliwo: " + getTypPaliwa());
    }
}
