public class Ciezarowka extends Pojazd implements TypPaliwa {
    private final double ladownosc;
    private final TypPaliwa typPaliwa;

    public Ciezarowka(String nrRejestracyjny, String numerVin, String kolor, double cena,
                      double spalanie, double poziomPaliwa, double przebieg,
                      double ladownosc, TypPaliwa typPaliwa) {
        super(nrRejestracyjny, numerVin, kolor, cena, spalanie, poziomPaliwa, przebieg);
        this.ladownosc = ladownosc;
        this.typPaliwa = typPaliwa;
    }

    @Override
    public String getTypPaliwa() {
        return typPaliwa.getTypPaliwa();
    }

    @Override
    public void wyswietlInformacje() {
        System.out.println("Ciężarówka: " + nrRejestracyjny + ", ładowność: " + ladownosc + "kg, paliwo: " + getTypPaliwa());
    }
}
