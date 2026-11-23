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
    }

    static void mostrarNotes(ArrayList<Float> notes) {

    }


    }
}