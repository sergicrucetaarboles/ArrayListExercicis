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

            // Mostrar el menú
            System.out.println("=== NOTES DE L'EXAMEN M04-UF1 ===");
            System.out.println("1. Introduir nota");
            System.out.println("2. Consultar la nota d'un índex");
            System.out.println("3. Eliminar una nota");
            System.out.println("4. Modificar una nota");
            System.out.println("5. Sortir");
        }

    }
}
