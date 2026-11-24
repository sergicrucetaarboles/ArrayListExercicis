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

            // Control d'errors: comprovem que sigui un número enter
            if (!teclat.hasNextInt()) { //hasNextInt() retorna true si el següent token és un int, false en cas contrari
                teclat.nextLine();
                System.out.println("Error: has d'introduir un número enter.");
            } else {
                opcio = teclat.nextInt();
                teclat.nextLine();
            }

            // introduir nota - opció 1
            if (opcio == 1) {

                // Demanem el nom (no pot estar buit)
                System.out.print("Nom de l'alumne: ");
                String nom = teclat.nextLine().trim();
                while (nom.isEmpty()) {
                    System.out.println("Error: el nom no pot estar buit.");
                    nom = teclat.nextLine().trim();
                }

                // Demanem la nota (ha de ser un float entre 0 i 10)
                float nota = 0;
                boolean notaValida = false;
                while (!notaValida) {


                }
            }




        }

    }
}
