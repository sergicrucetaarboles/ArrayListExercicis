import java.util.ArrayList;
import java.util.Scanner;

public class exercici01classe {

    static final Scanner teclat = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Float> notesAlumnes = new ArrayList<>();

        demanarNotes(notesAlumnes);
        mostrarNotes(notesAlumnes);
    }

    // Punts 1 i 2: llegeix notes fins que s'escriu 0
    static void demanarNotes(ArrayList<Float> notes) {
        System.out.println("Introdueix les notes (escriu 0 per acabar).");
        float nota;

        do {
            nota = llegirNota("Nota: ");
            if (nota != 0) {        // el 0 és només el senyal de parada
                notes.add(nota);
            }
        } while (nota != 0);
    }

    // Punt 3: imprimeix totes les notes
    static void mostrarNotes(ArrayList<Float> notes) {
        if (notes.isEmpty()) {
            System.out.println("No s'ha introduït cap nota.");
            return;
        }

        System.out.println("--- Notes introduïdes (" + notes.size() + ") ---");
        for (int i = 0; i < notes.size(); i++) {
            System.out.println("Nota " + (i + 1) + ": " + notes.get(i));
        }
    }

    // abans de llegir si el que ha escrit l'usuari és realment un float.
    static float llegirNota(String missatge) {
        while (true) {
            System.out.print(missatge);

            if (teclat.hasNextFloat()) {
                float nota = teclat.nextFloat();
                teclat.nextLine();              // neteja el salt de línia pendent

                if (nota >= 0 && nota <= 10) {
                    return nota;
                }
                System.out.println("Error: la nota ha d'estar entre 0 i 10.");
            } else {
                teclat.nextLine();              // descarta el text no vàlid
                System.out.println("Error: has d'escriure un número (ex. 7,5).");
        }
    }
}