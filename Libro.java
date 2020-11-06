
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
     * Devuelve el t�tulo del libro
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
     * Imprime el t�tulo del libro
     */
    public void imprimeTitulo() {
        System.out.println("El t�tulo del libro es " + titulo + ".");
    }
    
    /**
     * Devuelve el n�mero de p�ginas del libro
     */
    public int getNumeroPaginas() {
        return numeroPaginas;
    }
}
