public abstract class Pojazd {
    protected String nrRejestracyjny;
    protected String numerVin;
    protected String kolor;
    protected double cena;
    protected double spalanie; // l/100km
    protected double poziomPaliwa; // w litrach
    protected double przebieg; // w km

    public Pojazd(String nrRejestracyjny, String numerVin, String kolor, double cena, double spalanie, double poziomPaliwa, double przebieg) {
        this.nrRejestracyjny = nrRejestracyjny;
        this.numerVin = numerVin;
        this.kolor = kolor;
        this.cena = cena;
        this.spalanie = spalanie;
        this.poziomPaliwa = poziomPaliwa;
        this.przebieg = przebieg;
    }

    public void prowadz(double km) {
        double potrzebnePaliwo = (km * spalanie) / 100;
        if (poziomPaliwa >= potrzebnePaliwo) {
            przebieg += km;
            poziomPaliwa -= potrzebnePaliwo;
            System.out.println("Pojazd przejechał " + km + " km.");
        } else {
            System.out.println("Za mało paliwa, aby przejechać " + km + " km.");
        }
    }

    public void zatankuj(double litry) {
        poziomPaliwa += litry;
        System.out.println("Zatankowano " + litry + " litrów paliwa.");
    }

    public abstract void wyswietlInformacje();
}
