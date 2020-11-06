
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
    private String numeroReferencia;
    private int vecesPrestado;
    private boolean esLibroDeTexto;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroDePaginas, boolean libroTexto)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = numeroDePaginas;
        numeroReferencia = ("");
        vecesPrestado = 0;
        esLibroDeTexto = libroTexto;
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
     * Devuelve si es un libro de texto o no
     */
    public boolean getEsLibroDeTexto () {
        return esLibroDeTexto;
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
     * Delvuelve el número de referencia
     */
    public String getNumeroReferencia() {
        return numeroReferencia;
    }
    
    /**
     * Cambia el valor del número de referencia sin devolver ningún parámetro
     */
    public void setNumeroReferencia(String nuevoNumeroReferencia) {
        if (nuevoNumeroReferencia.length() <= 2) {
            System.out.println("El número de referencia debe tener al menos 3 caracteres");
        }
        else{
            numeroReferencia = nuevoNumeroReferencia;
        }
    }
    
    /**
     * Devuelve las veces que se ha prestado el libro
     */
    public int getVecesPrestado() {
        return vecesPrestado;
    }
    
    /**
     * Imita la acción de prestar un libro sumándole 1 al valor de vecesPrestado
     */
    public void prestar() {
        vecesPrestado += 1;
    }
    
    /**
     * Imprime los detalles con todos los atributos del libro
     */
    public void imprimirDetalles() {
        if (numeroReferencia == ("")) {
            System.out.println("Título: " + titulo + "");
            System.out.println("Autor: " + autor + "");
            System.out.println("Número de páginas: " + numeroPaginas + "");
            System.out.println("Número de referencia: ZZZ");
            System.out.println("Veces prestado: " + vecesPrestado + "");
            if (esLibroDeTexto == true) {
                System.out.println("Libro de texto: Sí");
            }
            else{
                System.out.println("Libro de texto: No");
            }
        }
        else {
            System.out.println("Título: " + titulo + "");
            System.out.println("Autor: " + autor + "");
            System.out.println("Número de páginas: " + numeroPaginas + "");
            System.out.println("Número de referencia: " + numeroReferencia + "");
            System.out.println("Veces prestado: " + vecesPrestado + "");
            if (esLibroDeTexto == true) {
                System.out.println("Libro de texto: Sí");
            }
            else{
                System.out.println("Libro de texto: No");
            }
        }
    }
    
    /**
     * Devuelve los detalles del libro
     */
    public String getDetalles() {
        String detallesLibro;
        if (numeroReferencia == ("")) {
            detallesLibro = "Título: " + titulo + ", Autor: " + autor + ", Número de páginas: " + numeroPaginas + ", Número de referencia: ZZZ.";
        }
        else {
            detallesLibro = "Título: " + titulo + ", Autor: " + autor + ", Número de páginas: " + numeroPaginas + ", Número de referencia: " + numeroReferencia + ".";
        }
        return detallesLibro;
    }
}
