package pl.pp;

import java.util.Scanner;

public class mojaPiataAplikacja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj znak do wydrukowania: ");
        char znak = scanner.next().charAt(0);

        System.out.print("Podaj szerokość (ile znaków w wierszu): ");
        int szerokosc = scanner.nextInt();

        System.out.print("Podaj wysokość (ile wierszy): ");
        int wysokosc = scanner.nextInt();

        printCharacterGrid(znak, szerokosc, wysokosc);
    }

    private static void printCharacterGrid(char znak, int szerokosc, int wysokosc) {
        for (int i = 0; i < wysokosc; i++) {
            for (int j = 0; j < szerokosc; j++) {
                System.out.print(znak);
            }
            System.out.println();
        }
    }
}
