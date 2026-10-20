import java.util.Scanner;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // --- LIBRO 1 ---
        System.out.print("Ingresá el título del libro 1: ");
        String titulo1 = scanner.nextLine();
        System.out.print("Ingresá el autor del libro 1: ");
        String autor1 = scanner.nextLine();

        // --- LIBRO 2 ---
        System.out.print("Ingresá el título del libro 2: ");
        String titulo2 = scanner.nextLine();
        System.out.print("Ingresá el autor del libro 2: ");
        String autor2 = scanner.nextLine();

        // Crear los objetos
        Libro libro1 = new Libro(titulo1, autor1);
        Libro libro2 = new Libro(titulo2, autor2);

        System.out.println("\n--- ESTADO INICIAL ---");
        libro1.mostrarEstado();
        libro2.mostrarEstado();

        // Prestar el libro 1
        System.out.println("\n--- PRESTAMOS ---");
        libro1.prestar();          // Debería funcionar

        // Intentar prestarlo otra vez (debe dar error)
        libro1.prestar();          // Muestra mensaje de error

        // Mostrar estado final de ambos
        System.out.println("\n--- ESTADO FINAL ---");
        libro1.mostrarEstado();
        libro2.mostrarEstado();

        scanner.close();
    }
}