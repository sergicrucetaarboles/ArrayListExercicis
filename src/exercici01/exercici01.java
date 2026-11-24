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

                    if (notesAlumnes.size() == 0) {
                        System.out.println("No hi ha cap nota registrada.");
                    } else {

                    }
                    for (int i = 0; i < notesAlumnes.size(); i++) {
                        System.out.println("Índex " + i + ": "
                                + nomsAlumnes.get(i)
                                + " -> "
                                + notesAlumnes.get(i));
                    }

                    // Demanem l'índex (entre 0 i size() - 1)
                    int index = 0;
                    boolean indexValid = false;
                    while (!indexValid) {
                        System.out.print("Índex: ");
                        if (!teclat.hasNextInt()) {
                            teclat.nextLine();
                            System.out.println("Error: has d'introduir un número enter.");
                        } else {
                            index = teclat.nextInt();
                            teclat.nextLine();
                            if (index >= 0 && index < notesAlumnes.size()) {
                                indexValid = true;
                            } else {
                                System.out.println("Error: l'índex ha d'estar entre 0 i " + (notesAlumnes.size() - 1) + ".");
                            }
                        }

                        // opcio 2 - consultar  get
                        if (opcio == 2) {
                            System.out.println("Alumne: "
                                    + nomsAlumnes.get(index)
                                    + " | Nota: "
                                    + notesAlumnes.get(index));
                        }

                        // opcio 3 - eliminar remove
                        else if (opcio == 3) {
                            String nomEliminat = nomsAlumnes.remove(index);
                            float notaEliminada = notesAlumnes.remove(index);
                        }

                        //opcio 4 - modificar set
                        else {
                            System.out.println("Nota actual de " + nomsAlumnes.get(index) + ": " + notesAlumnes.get(index));

                            float novaNota = 0;
                            boolean novaNotaValida = false;
                            while (!novaNotaValida) {
                                System.out.print("Nova nota (0-10): ");
                                if (!teclat.hasNextFloat()) {
                                    teclat.nextLine();
                                    System.out.println("Error: has d'introduir un número.");
                                } else {
                                    novaNota = teclat.nextFloat();
                                    teclat.nextLine();
                                    if (novaNota >= 0 && novaNota <= 10) {
                                        novaNotaValida = true;
                                    } else {
                                        System.out.println("Error: la nota ha d'estar entre 0 i 10.");
                                    }
                                }
                            }

                            notesAlumnes.set(index, novaNota);
                            System.out.println("Nota modificada correctament.");
                        }
                    }
                }

                // opcio 5- sortir
                else if (opcio == 5) {
                    System.out.println("Fins aviat!");
                }

                //altres numeros
                else {
                    System.out.println("Error: l'opció ha d'estar entre 1 i 5.");
                }
            }
        }
    }
}