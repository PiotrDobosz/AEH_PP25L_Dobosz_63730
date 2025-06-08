public class Motocykl extends Pojazd implements TypPaliwa {
    private final boolean posiadaDostawke;
    private final TypPaliwa typPaliwa;

    public Motocykl(String nrRejestracyjny, String numerVin, String kolor, double cena,
                    double spalanie, double poziomPaliwa, double przebieg,
                    boolean posiadaDostawke, TypPaliwa typPaliwa) {
        super(nrRejestracyjny, numerVin, kolor, cena, spalanie, poziomPaliwa, przebieg);
        this.posiadaDostawke = posiadaDostawke;
        this.typPaliwa = typPaliwa;
    }

    @Override
    public String getTypPaliwa() {
        return typPaliwa.getTypPaliwa();
    }

    @Override
    public void wyswietlInformacje() {
        System.out.println("Motocykl: " + nrRejestracyjny + ", z dostawką: " + posiadaDostawke + ", paliwo: " + getTypPaliwa());
    }
}
