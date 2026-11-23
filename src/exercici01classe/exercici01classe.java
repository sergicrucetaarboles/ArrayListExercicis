package exercici01classe;

import java.util.ArrayList;
import java.util.Scanner;

public class exercici01classe {

    static final Scanner teclat = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Float> notesAlumnes = new ArrayList<>();

        demanarNotes(notesAlumnes);
        mostrarNotes(notesAlumnes);
    }

    static void demanarNotes(ArrayList<Float> notes) {
        System.out.println("Introdueix les notes (escriu 0 per acabar).");

        while (true) {
            float nota = llegirNota("Nota: ");
            if (nota == 0) {
                break;
            }
            notes.add(nota);
        }
    }

    static float llegirNota(String missatge) {
        System.out.print(missatge);
        return teclat.nextFloat();
    }

    static void mostrarNotes(ArrayList<Float> notes) {
        if (notes.isEmpty()) {
            System.out.println("No s'ha introduït cap nota.");
            return;
        }

        System.out.println("--- Notes introduïdes (" + notes.size() + ") ---");
        for (int i = 0; i < notes.size(); i++) {
            System.out.println("Nota " + (i + 1) + ": " + notes.get(i));

            }
        static float llegirNota(String missatge) {

            System.out.print(missatge);
        }
    }
}