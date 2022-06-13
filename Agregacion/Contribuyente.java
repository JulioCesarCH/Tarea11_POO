package Tarea11.Agregacion;

public class Contribuyente {
    private int dni;
    private String nombres;
    private String apellidos;
    private int telf;

    public Contribuyente(int dni, String nombres, String apellidos, int telf) {
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telf = telf;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getTelf() {
        return telf;
    }

    public void setTelf(int telf) {
        this.telf = telf;
    }
}
