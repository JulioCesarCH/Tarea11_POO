package Tarea11.Composicion;

import Tarea11.Agregacion.Contribuyente;

public class Main {
    public static void main (String [] args){
        Libro LaMeta = new Libro ("LA META", "987654132","Eliyahu M. Goldratt",1984,2);
        Pagina pagina1 = new Pagina ("Se necesita mirar la\n" +
                "realidad y pensar de una manera lógica, precisa y consistente sobre los problemas y\n" +
                "determinar las relaciones de “causa y efecto” entre las acciones y los resultados", 1);
        Pagina pagina2 = new Pagina ("Son parámetros que expresan la meta de ganar dinero pero también permiten desarrollar\n" +
                "reglas operativas para manejar la planta. Estos son: throughput, Inventario y Gastos de Operacion",2);
        LaMeta.agregarPagina (pagina1);
        LaMeta.agregarPagina (pagina2);
        System.out.println("------------------Detalle de Libro--------------------");
        System.out.println("Libro: " + LaMeta.getTitulo());

        for(Pagina p : LaMeta.listarPaginas())
        {
            System.out.println("Pagina: " + p.getNumero());
            System.out.println("Resumen: " + p.getContenido());
        }

    }
}
