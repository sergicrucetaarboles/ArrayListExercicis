package exercici01;

import java.util.ArrayList;
import java.util.Scanner;

public class exercici01 {
    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        // Llista de notes (Float) i llista de noms (extra): van en paral·lel
        ArrayList<Float> notesAlumnes = new ArrayList<>();
        ArrayList<String> nomsAlumnes = new ArrayList<>();

        int opcio = 0;

        // Bucle del menú: es repeteix fins que l'usuari escull 5 (Sortir)
        while (opcio != 5) {

            // ---------- MENÚ ----------
            System.out.println();
            System.out.println("=== NOTES DE L'EXAMEN M04-UF1 ===");
            System.out.println("1. Introduir nota");
            System.out.println("2. Consultar la nota d'un índex");
            System.out.println("3. Eliminar una nota");
            System.out.println("4. Modificar una nota");
            System.out.println("5. Sortir");
            System.out.print("Escull una opció (1-5): ");

            // Control d'errors: comprovem que sigui un número enter
            if (!teclat.hasNextInt()) {
                teclat.nextLine(); // esborrem el que ha escrit l'usuari
                System.out.println("Error: has d'introduir un número enter.");
            } else {
                opcio = teclat.nextInt();
                teclat.nextLine(); // netegem el salt de línia pendent

                // ---------- OPCIÓ 1: INTRODUIR NOTA ----------
                if (opcio == 1) {

                    // Demanem el nom (no pot estar buit)
                    System.out.print("Nom de l'alumne: ");
                    String nom = teclat.nextLine().trim();
                    while (nom.isEmpty()) {
                        System.out.println("Error: el nom no pot estar buit.");
                        System.out.print("Nom de l'alumne: ");
                        nom = teclat.nextLine().trim();
                    }

                    // Demanem la nota (ha d'estar entre 0 i 10)
                    float nota = 0;
                    boolean notaValida = false;
                    while (!notaValida) {
                        System.out.print("Nota de " + nom + " (0-10): ");
                        if (!teclat.hasNextFloat()) {
                            teclat.nextLine();
                            System.out.println("Error: has d'introduir un número.");
                        } else {
                            nota = teclat.nextFloat();
                            teclat.nextLine();
                            if (nota >= 0 && nota <= 10) {
                                notaValida = true;
                            } else {
                                System.out.println("Error: la nota ha d'estar entre 0 i 10.");
                            }
                        }
                    }

                    // Afegim el nom i la nota al final de les llistes
                    nomsAlumnes.add(nom);
                    notesAlumnes.add(nota);
                    System.out.println("Nota afegida a l'índex " + (notesAlumnes.size() - 1) + ".");
                }

                // ---------- OPCIONS 2, 3 i 4: necessiten un índex ----------
                else if (opcio >= 2 && opcio <= 4) {

                }
            }
        }
    }
}