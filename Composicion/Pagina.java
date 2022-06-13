package Tarea11.Composicion;

public class Pagina {
    private String contenido;
    private int numero;
    public Pagina (String contenido, int numero){
        this.contenido = new String (contenido);
        this.numero = numero;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
