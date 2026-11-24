package exerciciclassenov24;

import java.util.ArrayList;
import java.util.Scanner;

public class exerciciclassenov24 {

    Scanner teclat = new Scanner(System.in);

    void main() {
        ArrayList<String> productes = new ArrayList<>();

        productes.add("Teclat mecànic Logitech");
        productes.add("Laptop HP");
        productes.add("Ratolí HP");

        /* TODO: Menú per triar entre les opcions. Inclou control d'errors
         * 1. Veure tots els productes
         * 2. Veure un sol producte (l'usuari el tria per id)
         * 3. Canvia nom d'un producte (l'usuari tria per id i dona nou nom)
         * 4. Eliminem un producte.
         */

        int opcio = -1;
        while (opcio != 0) {
            System.out.println();
            System.out.println("===== GESTIÓ DE PRODUCTES =====");
            System.out.println("1. Veure tots els productes");
            System.out.println("2. Veure un sol producte");
            System.out.println("3. Canviar el nom d'un producte");
            System.out.println("4. Eliminar un producte");
            System.out.println("0. Sortir");
            System.out.print("Tria una opció: ");

            // Control d'errors: si no és un número enter, es descarta i es torna al menú
            if (!teclat.hasNextInt()) {
                System.out.println("Error: has d'introduir un número enter.");
                teclat.nextLine();
                continue;
            }
            opcio = teclat.nextInt();
            teclat.nextLine();
        }

        if (opcio == 1) {
            if (productes.isEmpty()) {
                System.out.println("No hi ha cap producte a la llista.");
            } else {
                for (int i = 0; i < productes.size(); i++) {
                    System.out.println((i + 1) + ". " + productes.get(i));
                }
            }
        }
    }
}
