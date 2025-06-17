public class Komiks extends Ksiazka implements FormatKsiazki {
    private boolean czyKolorowy;
    private FormatKsiazki format;

    public Komiks(String tytul, String autor, String isbn, int rokWydania, boolean czyKolorowy, FormatKsiazki format) {
        super(tytul, autor, isbn, rokWydania);
        this.czyKolorowy = czyKolorowy;
        this.format = format;
    }

    public String getFormat() {
        return format.getFormat();
    }

    public void wyswietlInformacje() {
        System.out.println("Komiks: " + tytul + ", kolorowy: " + czyKolorowy + ", format: " + getFormat());
    }
}
