package Tarea11.Agregacion;

import Tarea10.Producto;

public class Municipalidad {
    private String ruc;
    private String razonSocial;
    private String direccion;
    private String web;

    private Contribuyente[] contribuyente;

    private int contarContribuyente;

    public Municipalidad(String ruc, String razonSocial, String direccion, String web,int contribTotal) {
        this.ruc = ruc;
        this.razonSocial = razonSocial;
        this.direccion = direccion;
        this.web = web;
        this.contribuyente = new Contribuyente[contribTotal];
        this.contarContribuyente = 0;
    }

    public void agregarContribuyente(Contribuyente nuevoContribuyente)
    {
        this.contribuyente[this.contarContribuyente] = nuevoContribuyente;

        this.contarContribuyente++;
    }

    public Contribuyente[] listarContribuyentes()
    {
        return this.contribuyente;
    }
    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public int getContarContribuyente() {
        return contarContribuyente;
    }

    public void setContarContribuyente(int contarContribuyente) {
        this.contarContribuyente = contarContribuyente;
    }
}
