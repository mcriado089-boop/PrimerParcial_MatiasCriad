public class Libro {

    // Atributos PRIVADOS (encapsulamiento)
    private String titulo;
    private String autor;
    private boolean disponible;

    // Constructor: recibe título y autor
    // Todo libro nuevo nace DISPONIBLE
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;   // siempre arranca disponible
    }

    // Método PRESTAR: solo si estaba disponible
    public void prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("El libro \"" + titulo + "\" fue prestado.");
        } else {
            System.out.println("ERROR: El libro \"" + titulo + "\" NO está disponible.");
        }
    }

    // Método DEVOLVER: vuelve a quedar disponible
    public void devolver() {
        disponible = true;
        System.out.println("El libro \"" + titulo + "\" fue devuelto.");
    }

    // Getter para mostrar el estado en el main
    public boolean isDisponible() {
        return disponible;
    }

    // Método para imprimir el estado del libro
    public void mostrarEstado() {
        String estado = disponible ? "Disponible" : "Prestado";
        System.out.println("Libro: " + titulo + " | Autor: " + autor + " | Estado: " + estado);
    }
}