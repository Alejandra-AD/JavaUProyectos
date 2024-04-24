package com.alejandraad.javauproyectos.repasopackage.app;
import com.alejandraad.javauproyectos.repasopackage.modelos.*;

public class app {
    public static void main(String[] args) {

        Persona mama = new Persona("Lucia","Pérez",60,"Ingeniera en sistemas","mamá");
        mama.datosIntegrante();
        System.out.println("******************************************");
        mama.setNombre("Camila");
        mama.datosIntegrante();
        System.out.println("******************************************");
        mama.trabajar();

        Persona hijo = new Persona("Juanito","Pérez",15,"estudiante","hijo");

        hijo.datosIntegrante();
        hijo.trabajar();

        
    }
}
