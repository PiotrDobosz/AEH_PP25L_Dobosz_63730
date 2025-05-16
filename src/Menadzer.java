public class Menadzer extends Pracownik {
    private final int liczbaPodwladnych;
    private final double dodatekDoPensji;

    public Menadzer(String imie, String nazwisko, String pesel, String stanowisko, double pensja, int liczbaPodwladnych) {
        super(imie, nazwisko, pesel, stanowisko, pensja);
        this.liczbaPodwladnych = liczbaPodwladnych;
        this.dodatekDoPensji = 0.1 * pensja;
    }

    @Override
    public String toString() {
        return super.toString() + "; liczba podwładnych: " + liczbaPodwladnych + "; dodatek do pensji: " + dodatekDoPensji;
    }

    @Override
    public double obliczRoczneWynagrodzenie() {
        return (getPensja() + dodatekDoPensji) * 12;
    }
}
