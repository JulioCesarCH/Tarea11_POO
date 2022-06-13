package Tarea11.Agregacion;

import Tarea10.Producto;

public class Main {
    public static void main (String [] args){
        Municipalidad MuniHuanuco = new Municipalidad ("20146008845","Municipalidad Provincial de Huanuco","Jr. General Prado Nro. 750","www.munihuanuco.gob.pe",2);
        Contribuyente jcueva = new Contribuyente (12345678, "Julio Cesar","Cueva",954963214);
        Contribuyente fvilchez = new Contribuyente (98546251, "Freddy","Vilchez",15926483);
        MuniHuanuco.agregarContribuyente (jcueva);
        MuniHuanuco.agregarContribuyente (fvilchez);
        System.out.println("------------------Detalle de Municipalidad y sus Contribuyentes--------------------");
        System.out.println("Municipalidad:");
        System.out.println("RUC: " + MuniHuanuco.getRuc());
        System.out.println("Razon Social: " + MuniHuanuco.getRazonSocial());
        System.out.println("Direccion: " + MuniHuanuco.getDireccion());
        System.out.println("Web: " + MuniHuanuco.getWeb());
        System.out.println("Contribuyentes:");

        for(Contribuyente c : MuniHuanuco.listarContribuyentes())
        {
            System.out.println("DNI: " + c.getDni());
            System.out.println("Nombres: " + c.getNombres());
            System.out.println("Apellidos: " + c.getApellidos());
            System.out.println("Telefono: " + c.getTelf());
        }
    }
}
