public abstract class Ksiazka {
    protected String tytul;
    protected String autor;
    protected String isbn;
    protected int rokWydania;
    protected boolean dostepna = true;

    public Ksiazka(String tytul, String autor, String isbn, int rokWydania) {
        this.tytul = tytul;
        this.autor = autor;
        this.isbn = isbn;
        this.rokWydania = rokWydania;
    }

    public void wypozycz() {
        if (dostepna) {
            dostepna = false;
            System.out.println("Wypożyczono: " + tytul);
        } else {
            System.out.println("Książka niedostępna: " + tytul);
        }
    }

    public void zwroc() {
        dostepna = true;
        System.out.println("Zwrócono: " + tytul);
    }

    public abstract void wyswietlInformacje();

    public String isDostepna() {
        return "";
    }
}
