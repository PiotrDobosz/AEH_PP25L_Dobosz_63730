public class Powiesc extends Ksiazka implements FormatKsiazki {
    private String gatunek;
    private FormatKsiazki format;

    public Powiesc(String tytul, String autor, String isbn, int rokWydania, String gatunek, FormatKsiazki format) {
        super(tytul, autor, isbn, rokWydania);
        this.gatunek = gatunek;
        this.format = format;
    }

    public String getFormat() {
        return format.getFormat();
    }

    public void wyswietlInformacje() {
        System.out.println("Powieść: " + tytul + ", gatunek: " + gatunek + ", format: " + getFormat());
    }
}
