package com.alejandraad.javauproyectos.repasopackage.jardin;

import com.alejandraad.javauproyectos.repasopackage.modelos.Jugar;
import com.alejandraad.javauproyectos.repasopackage.modelos.Mascota;

public class Perro extends Mascota implements Jugar {

    public Perro(String nombre, int edad, String especie) {
        super(nombre, edad, especie);
    }

    @Override
    public void jugar(){
        System.out.println("jugar desde perro");

    };
}
