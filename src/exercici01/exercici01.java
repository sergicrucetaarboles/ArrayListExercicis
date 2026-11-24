import java.util.ArrayList;
import java.util.Scanner;

public class exercici01 {

    static final int AFEGIR = 1;
    static final int CONSULTAR = 2;
    static final int ELIMINAR = 3;
    static final int MODIFICAR = 4;
    static final int SORTIR = 5;

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        ArrayList<Float> notesAlumnes = new ArrayList<>();
        ArrayList<String> nomsAlumnes = new ArrayList<>();

        int opcio;

        do {
            mostrarMenu();

            opcio = llegirEnterEnRang(teclat, "Escull una opció (1-5): ", AFEGIR, SORTIR);

        } while (opcio != SORTIR);

    }
    public static void mostrarMenu() {
        System.out.println();
        System.out.println("=== NOTES DE L'EXAMEN M04-UF1 ===");
        System.out.println("1. Introduir nota");
        System.out.println("2. Consultar la nota d'un índex");
        System.out.println("3. Eliminar una nota");
        System.out.println("4. Modificar una nota");
        System.out.println("5. Sortir");
    }

}