package Tarea11.Composicion;

import Tarea11.Agregacion.Contribuyente;

public class Libro {
    private String titulo;
    private String isbn;
    private String autor;
    private int anioPublicacion;
    private Pagina [] paginas;
    private int contarPaginas;
    public Libro(String titulo, String isbn, String autor, int anioPublicacion, int pagTotales){
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.paginas = new Pagina [pagTotales];
        this.contarPaginas = 0;
    }

    public int getContarPaginas() {
        return contarPaginas;
    }

    public void agregarPagina (Pagina nuevaPagina){
            this.paginas [this.contarPaginas] = nuevaPagina;
            this.contarPaginas++;
    }
    public Pagina[] listarPaginas()
    {
        return this.paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
}
