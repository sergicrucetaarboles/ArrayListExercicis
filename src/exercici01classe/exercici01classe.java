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
        float nota;

        do {
            nota = llegirNota("Nota: ");
        } while (nota != 0);
        if (nota != 0) {
            notes.add(nota);
        }
    }

    static void mostrarNotes(ArrayList<Float> notes) {
        if (notes.isEmpty()) {
            System.out.println("No s'ha introduït cap nota.");
            return;
        }
    }
    System.out.println("--- Notes introduïdes (" + notes.size() + ") ---");

    for (int i = 0; i < notes.size(); i++) {

    }
    }
}