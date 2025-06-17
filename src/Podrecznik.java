public class Podrecznik extends Ksiazka implements FormatKsiazki {
    private String przedmiot;
    private FormatKsiazki format;

    public Podrecznik(String tytul, String autor, String isbn, int rokWydania, String przedmiot, FormatKsiazki format) {
        super(tytul, autor, isbn, rokWydania);
        this.przedmiot = przedmiot;
        this.format = format;
    }

    public String getFormat() {
        return format.getFormat();
    }

    public void wyswietlInformacje() {
        System.out.println("Podręcznik: " + tytul + ", przedmiot: " + przedmiot + ", format: " + getFormat());
    }
}
