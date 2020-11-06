
/**
 * Una clase que representa objetos libro.
 * Esta clase podria formar parte de un
 * proyecto mas grande, como el de una aplicacion de
 * una biblioteca
 * 
 * @author Miguel Bayon 
 * @version 1.0
 */
public class Libro {

    private String autor;
    private String titulo;
    private int numeroPaginas;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroDePaginas)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = numeroDePaginas;
    }
    
    /**
     * Devuelbe el nombre del autor
     */
    public String getAutor() {
        return autor;
    }
    
    /**
     * Devuelve el título del libro
     */
    public String getTitulo() {
        return titulo;
    }
    
    /**
     * Imprime el nombre del autor
     */
    public void imprimeAutor() {
        System.out.println("El autor es " + autor + ".");
    }
    
    /**
     * Imprime el título del libro
     */
    public void imprimeTitulo() {
        System.out.println("El título del libro es " + titulo + ".");
    }
    
    /**
     * Devuelve el número de páginas del libro
     */
    public int getNumeroPaginas() {
        return numeroPaginas;
    }
    
    /**
     * Imprime los detalles con todos los atributos del libro
     */
    public void imprimirDetalles() {
        System.out.println("Título: " + titulo + ".");
        System.out.println("Autor: " + autor + ".");
        System.out.println("Número de páginas: " + numeroPaginas + ".");
    }
    
    public String getDetalles() {
        String detallesLibro = "Título: " + titulo + ", Autor: " + autor + ", Número de páginas: " + numeroPaginas + ".";
        return detallesLibro;
    }
}
