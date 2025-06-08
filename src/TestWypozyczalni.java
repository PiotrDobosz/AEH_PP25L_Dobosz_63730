public class TestWypozyczalni {
    public static void main(String[] args) {
        Osobowe osobowe = new Osobowe("KR12345", "VIN123", "Czerwony", 50000, 6.5, 20, 100000, 5, new Benzyna());
        Ciezarowka ciezarowka = new Ciezarowka("KR54321", "VIN456", "Biały", 120000, 12.0, 50, 200000, 10000, new Diesel());
        Motocykl motocykl = new Motocykl("KR98765", "VIN789", "Czarny", 20000, 4.0, 10, 30000, true, new Benzyna());
        SprzetBudowlany sprzet = new SprzetBudowlany("KR11223", "VIN321", "Żółty", 150000, 15.0, 30, 5000, 300, new Diesel());

        osobowe.wyswietlInformacje();
        osobowe.prowadz(100);
        osobowe.zatankuj(10);
        System.out.println();

        ciezarowka.wyswietlInformacje();
        motocykl.wyswietlInformacje();
        sprzet.wyswietlInformacje();
    }
}
