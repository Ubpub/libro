
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
     * Devuelve el t�tulo del libro
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
    
    /**
     * Delvuelve el n�mero de referencia
     */
    public String getNumeroReferencia() {
        return numeroReferencia;
    }
    
    /**
     * Cambia el valor del n�mero de referencia sin devolver ning�n par�metro
     */
    public void setNumeroReferencia(String nuevoNumeroReferencia) {
        if (nuevoNumeroReferencia.length() <= 2) {
            System.out.println("El n�mero de referencia debe tener al menos 3 caracteres");
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
     * Imita la acci�n de prestar un libro sum�ndole 1 al valor de vecesPrestado
     */
    public void prestar() {
        vecesPrestado += 1;
    }
    
    /**
     * Imprime los detalles con todos los atributos del libro
     */
    public void imprimirDetalles() {
        if (numeroReferencia == ("")) {
            System.out.println("T�tulo: " + titulo + "");
            System.out.println("Autor: " + autor + "");
            System.out.println("N�mero de p�ginas: " + numeroPaginas + "");
            System.out.println("N�mero de referencia: ZZZ");
            System.out.println("Veces prestado: " + vecesPrestado + "");
            if (esLibroDeTexto == true) {
                System.out.println("Libro de texto: S�");
            }
            else{
                System.out.println("Libro de texto: No");
            }
        }
        else {
            System.out.println("T�tulo: " + titulo + "");
            System.out.println("Autor: " + autor + "");
            System.out.println("N�mero de p�ginas: " + numeroPaginas + "");
            System.out.println("N�mero de referencia: " + numeroReferencia + "");
            System.out.println("Veces prestado: " + vecesPrestado + "");
            if (esLibroDeTexto == true) {
                System.out.println("Libro de texto: S�");
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
            detallesLibro = "T�tulo: " + titulo + ", Autor: " + autor + ", N�mero de p�ginas: " + numeroPaginas + ", N�mero de referencia: ZZZ.";
        }
        else {
            detallesLibro = "T�tulo: " + titulo + ", Autor: " + autor + ", N�mero de p�ginas: " + numeroPaginas + ", N�mero de referencia: " + numeroReferencia + ".";
        }
        return detallesLibro;
    }
}
